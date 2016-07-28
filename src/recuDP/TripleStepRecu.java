package recuDP;

public class TripleStepRecu {
	private static int[] steps = {1,2,3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int totalWays = tripleStep(n);
		System.out.println(totalWays);
	}
	private static int tripleStep(int n){
		if(n==0) return 1;
		int totalWays=0;

		for(int step: steps){
			if(n>=step) totalWays += tripleStep(n-step);
		}
		return totalWays;
	}	
}
