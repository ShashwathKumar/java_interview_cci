package stackQs;
import java.util.Stack;

public class setOfStacks extends Stack<Integer>{
	private Integer topE;
	private Integer maxPile;
	
	public setOfStacks(Integer maxPile){
		this.maxPile = maxPile;
		this.topE = 0;
	}
	
	public Integer push(Integer e){
		if(!this.isEmpty())topE=super.peek();
		if(topE < maxPile){
			if(!this.isEmpty())super.pop();
			topE++;
			super.push(topE);
		}else{
			super.push(1);
		}
		return e;
	}
	
	public Integer pop(){
		topE=super.peek();
		if(topE>1){
			topE = super.pop();
			topE--;
			super.push(topE);
		}else{
			super.pop();
			topE=super.peek();
		}
		return topE;
	}

}
