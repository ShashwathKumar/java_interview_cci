package stackQs;
import java.util.Stack;

public class myQ {
	public Stack<Integer> pushStack = new Stack<Integer>();
	public Stack<Integer> popStack = new Stack<Integer>();
	
	public void add(Integer e){
		pushStack.push(e);
	}
	
	public Integer poll(){
		if(popStack.isEmpty()){
			while(!pushStack.isEmpty()){
				popStack.push(pushStack.pop());
			}
		}
		return popStack.pop();
	}
}
