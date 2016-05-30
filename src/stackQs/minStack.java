package stackQs;
import java.util.Stack;

public class minStack extends Stack<Integer>{
	private Stack<Integer> minS = new Stack<Integer>();
	
	public Integer min(){
		if(minS.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return minS.peek();
	}
	
	@Override
	public Integer push(Integer e){
		super.push(e);
		if (e <= min()){
			minS.push(e);
		}
		return e;
	}
	
	@Override
	public Integer pop(){
		Integer e=super.pop();
		if(e==min()){
			minS.pop();
		}
		return e;
	}

}

