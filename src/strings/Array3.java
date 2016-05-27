package strings;
import java.util.ArrayList;

//ArrayList is not working -- need to think of a diff strategy

public class Array3 {
	private static ArrayList<ArrayList<Integer>> A;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		//print();

		for(int i=0; i<5; i++){
			System.out.println(minTerator());
			System.out.println(A);
		}
		
	}
	
	public static Integer minTerator(){
		Integer min=Integer.MAX_VALUE;
		int len=A.size();
		int mini=0;
		for(int i=0; i<len; i++){
			if(A.get(i).get(0)<min){
				min = (A.get(i)).get(0);
				mini=i;
			}
		}
		A.get(mini).remove(0);
		return min;
	}
	
	public static void init(){
		A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int j=0; j<5; j++){
			temp.add(j);
		}
		for(int i=0; i<5; i++){
			A.add(temp);
		}
	}
	
	public static void print(){
		for(int i=0; i<A.size(); i++){
			for(int j=0; j<A.get(i).size(); j++){
				System.out.print(A.get(i).get(j));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
