package strings;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Stringo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "Haribol";
		System.out.println(unique(str));
		
		String str1="Haribol", str2="aHirlob2";
		System.out.println(permute(str1, str2));
		
		
		char[] str="Hare Krishna Hari    ".toCharArray();
		System.out.println(URLify(str,17));
		*/
		
		String str = "kkaannffy";
		System.out.println(paliPermute(str));
	}
	
	public static boolean paliPermute(String str){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char currChar;
		Integer val, odd=0;
		for(int i=0; i<str.length(); i++){
			currChar = str.charAt(i);
			if(!hm.containsKey(currChar)){
				hm.put(currChar, 1);
			}else{
				val = hm.get(currChar);
				hm.put(currChar, val+1);
			}
		}
		Set set = hm.entrySet();
		Iterator iter = set.iterator();
		
		System.out.println(hm);
		
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			val = (Integer) entry.getValue();
			if(val%2 != 0) odd++;
		}
		if (odd > 1) return false;
		return true;
	}
	
	public static char[] URLify(char[] str, int len){
		String fin="";
		
		for(int i=str.length-1, j=len-1; i>=0; i--, j--){
			if(str[j]!=' ')
				str[i]=str[j];
			else{
				str[i]='0';
				i--;
				str[i]='2';
				i--;
				str[i]='%';
			}
		}
		return str;
	}
	
	public static boolean permute(String str1, String str2){
		HashSet<Character> hash = new HashSet<Character>();
		int len1 = str1.length();
		int len2 = str2.length();
		char charNow;
		
		if(len1!=len2) return false;
				
		for(int i=0; i<len1; i++) hash.add(str1.charAt(i));
		for(int i=0; i<len1; i++){
			charNow = str2.charAt(i);
			if(hash.contains(charNow)){
				hash.remove(charNow);
			}else{
				return false;
			}
		}
		return true;
	}
	
	public static boolean unique(String str){
		boolean[] chars = new boolean[128];
		int ascii;
		
		for(int i=0; i<128; i++) chars[i] = false;
		for(int i=0; i<str.length(); i++){
			ascii= (int)str.charAt(i);
			if(chars[ascii]) return false;
			else chars[ascii]=true;
		}
		
		return true;
	}

}
