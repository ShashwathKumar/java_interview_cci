package recuDP;
import java.util.HashMap;

public class SubstringDictRecu {
	private static String str = new String("Hello");
	private static HashMap<String, String> dict = new HashMap<String, String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createHM();
		printPermutes(str);
	}
	private static void printPermutes(String str){
		int len = str.length();
		String strSub;
		for(int i=1; i<=len; i++){
			strSub = str.substring(0, i);
			if(dict.containsKey(strSub))
			  System.out.println(strSub);
		}
		if(str.length()>1)	printPermutes(str.substring(1));
		else return;
	}
	private static void createHM(){
		dict.put("llo", "abra kadabra");
		dict.put("Hell", "place u wudn't wanna go");
	}
}
