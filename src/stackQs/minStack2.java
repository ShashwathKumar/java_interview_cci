package stackQs;

public class minStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minStack s = new minStack();
		s.push(2);
		s.push(3);
		s.push(1);
		printStats(s);
		s.pop();
		printStats(s);
	}
	public static void printStats(minStack s){
		System.out.println(s);
		System.out.println(s.min());
		System.out.println("------------");
	}

}
