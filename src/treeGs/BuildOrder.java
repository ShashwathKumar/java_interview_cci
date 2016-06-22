package treeGs;
import java.util.ArrayList;
import java.util.HashMap;

public class BuildOrder {
	private static class Job{
		Character name;
		ArrayList<Character> deps = new ArrayList<Character>();
		public Job(Character name){
			this.name = name;
		}
	}
	private static ArrayList<Job> jobs = new ArrayList<Job>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		//ArrayList<Character> projList = buildOrder();
	}
	
	public static void init(){
		Job a = new Job('a');
		a.deps.add('f');
		Job b = new Job('b');
		b.deps.add('f');
		Job c = new Job('c');
		c.deps.add('d');
		Job d = new Job('d');
		a.deps.add('a');
		a.deps.add('b');
		Job e = new Job('e');
		Job f = new Job('f');
	}
	
	public static ArrayList<Character> buildOrder(){
		ArrayList<Character> projList = new ArrayList<Character>();
		return projList;
	}
}
