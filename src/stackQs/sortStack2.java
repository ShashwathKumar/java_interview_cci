package stackQs;

public class sortStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortStack s = new sortStack();
		s.push(2);
		s.push(4);
		s.push(1);
		printStats(s);
		s.sorto();
		printStats(s);
		System.out.println(s.pop());
	}

	public static void printStats(sortStack s){
		System.out.println(s);
		System.out.println(s.tempS);
		System.out.println("--------------");
	}
}
