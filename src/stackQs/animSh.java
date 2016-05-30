package stackQs;
import java.util.LinkedList;

public class animSh {
	public LinkedList<String> l = new LinkedList<String>();
	
	public void enqueue(Character c, String s){
		s = c + s;
		if(c=='c' || c=='d'){
			l.addFirst(s);
		}
	}
	public String dequeAny(){
		return l.removeLast().substring(1);
	}
	public String dequeCat(){
		int size = l.size();
		char animal;
		
		for(int i=size-1; i>=0; i--){
			animal=l.get(i).charAt(i);
			if(animal=='c'){
				return l.remove(i).substring(1);
			}
		}
		return null;
	}
	public String dequeDog(){
		int size = l.size();
		char animal;
		
		for(int i=size-1; i>=0; i--){
			animal=l.get(i).charAt(i);
			if(animal=='d'){
				return l.remove(i).substring(1);
			}
		}
		return null;
	}
}
