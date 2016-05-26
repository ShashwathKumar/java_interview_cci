package strings;

public class Stringo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hare Krishna";
		String s2="Hare Krisha";
		System.out.println(oneAway(s1, s2));
	}

	public static boolean oneAway(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		if(Math.abs(len1-len2)>1) return false;
		
		if(len1>len2){
			return diff(s1,s2);
		}else if(len1<len2){
			return diff(s2,s1);
		}else{
			return diff2(s1,s2);
		}
	}
	
	public static boolean diff(String st1, String st2){
		int diff=0;
		for(int i=0, j=0; i<st2.length(); i++, j++){
			if(st1.charAt(i)!=st2.charAt(j)){
				j--; 
				//just trying to compare same character to st2 with next character of st1
				diff++;
				if(diff>1) return false;
			}
		}
		return true;
	}
	
	public static boolean diff2(String st1, String st2){
		int diff=0;
		for(int i=0; i<st1.length(); i++){
			if(st1.charAt(i)!=st2.charAt(i)){
				diff++;
				if(diff>1) return false;
			}
		}
		return true;
	}
}
