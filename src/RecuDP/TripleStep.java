package RecuDP;

public abstract class TripleStep {
	private static int[] steps = {1,2,3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int numOfWays = tripleStep(n);
		System.out.println(numOfWays);
	}
	private static int tripleStep(int n){
		System.out.println("tripleStep1");
		return tripleStep(n, 1);
	}
	private static int tripleStep(int n, int nWays){
		System.out.println("tripleStep2");
		if(n==0) return 1;
		
		int totalSteps = 0, waysMultiplier=0;
		for(int step:steps){
			if(n>=step) waysMultiplier++;
		}
		for(int step: steps){
			if(n>=step){
				totalSteps += tripleStep(n-step, nWays*waysMultiplier);
			}
		}
		return totalSteps;
	}
}
