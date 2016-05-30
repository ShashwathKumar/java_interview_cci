package stackQs;

public class setOfStacks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setOfStacks s = new setOfStacks(4);
		s.push(1);
		s.push(1);
		s.push(1);
		printStats(s);
		s.push(1);
		s.push(1);
		s.push(1);
		printStats(s);
		s.pop();
		s.pop();
		s.pop();
		printStats(s);
	}
	public static void printStats(setOfStacks s){
		System.out.println(s);
	}

}
