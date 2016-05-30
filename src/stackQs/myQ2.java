package stackQs;

public class myQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myQ q = new myQ();
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		printStats(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		printStats(q);
		q.add(6);
		q.add(7);
		System.out.println(q.poll());
		printStats(q);
		System.out.println(q.poll());
		printStats(q);
		System.out.println(q.poll());
		printStats(q);
	}
	public static void printStats(myQ q){
		System.out.println(q.pushStack);
		System.out.println(q.popStack);
		System.out.println("-----------");
	}

}
