package recuDP;

import java.util.Arrays;

public class TripleStep {
	private static int[] arr;
	private static int[] steps = {1, 2, 3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		arr = new int[n+1];
		Arrays.fill(arr, -1);
		//System.out.println(arr[n]);
		int numOfWays = tripleStep(n);
		System.out.println(numOfWays);
	}
	private static int tripleStep(int n){
		//System.out.println(arr[n]+" "+n);
		int total=0;
		if(n==0) return 1;
		else if(arr[n]!=-1){
			//System.out.println(arr[n]+" "+n);
			return arr[n];
		}
		else{
			for(int step: steps){
				if(n>=step) total += tripleStep(n-step);
			}
			arr[n] = total;
			return total;
		}
	}

}
