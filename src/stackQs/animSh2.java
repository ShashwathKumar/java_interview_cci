package stackQs;

public class animSh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animSh animu = new animSh();
		animu.enqueue('c', "Fluffy");
		animu.enqueue('c', "Tuffy");
		animu.enqueue('c', "Muffy");
		printStats(animu);
		System.out.println(animu.dequeAny());
		animu.enqueue('d', "Tommy");
		animu.enqueue('d', "Rommy");
		animu.enqueue('c', "Cuty");
		printStats(animu);
		System.out.println(animu.dequeCat());
		System.out.println(animu.dequeDog());
	}
	public static void printStats(animSh animu){
		System.out.println(animu.l);
	}

}
