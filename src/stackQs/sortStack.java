package stackQs;
import java.util.Stack;

public class sortStack extends Stack<Integer> {
	public Stack<Integer> tempS=new Stack<Integer>();
	
	public void sorto(){
		while(!this.isEmpty()){
			if(this.peek()>=tempPeek()){
				tempS.push(this.pop());
			}else{
				Integer tempPop = this.pop();
				int count=0;
				while(tempPop<tempPeek()){
					this.push(tempS.pop());
					count++;
				}
				this.push(tempPop);
				while(count!=0){
					tempS.push(this.pop());
					count--;
				}
			}
		}
		while(!tempS.isEmpty()){
			this.push(tempS.pop());
		}
	}
	
	public Integer tempPeek(){
		return tempS.isEmpty()?Integer.MIN_VALUE: tempS.peek();
	}
}
