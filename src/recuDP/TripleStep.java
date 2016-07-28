package recuDP;
import java.util.HashMap;
//we can just use an array instead of HashMap, since it is just having keys from 1 to n
//understand that final answer is stored in an integer. This program works well as long as int variable can
//hold the answer. But it will quickly overflow after 36.
//Using long will give some solace. It can be effectively solved using BigInteger class.
//Its nice to show the interviewer that u think abt these issues

public class TripleStep {
	private static int[] steps = {1,2,3};
	private static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=37;
		hm.put(0, 1);
		int totalWays = tripleStep(n);
		System.out.println(totalWays);
	}
	private static int tripleStep(int n){
		if(hm.containsKey(n)) return hm.get(n);
		int totalWays=0;
		
		//System.out.println("tripleStep");
		for(int step: steps){
			if(n>=step){
				totalWays += tripleStep(n-step);
			}
		}
		if(!hm.containsKey(n)) hm.put(n, totalWays);
		return totalWays;
	}
	
}
