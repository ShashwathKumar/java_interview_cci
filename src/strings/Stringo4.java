package strings;

public class Stringo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ram";
		String s2 = "amR";
		System.out.println(checkRotate(s1,s2));
	}

	public static boolean checkRotate(String s1, String s2){
		String s = s1+s1, subStr;
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 != len2) return false;
		
		for(int i=0; i<len1; i++){
			subStr=s.substring(i, i+len1);
			if(subStr.compareTo(s2)==0) return true;
		}
		
		return false;
	}
}
