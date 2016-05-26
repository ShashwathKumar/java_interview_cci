package strings;

public class Stringo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcc";
		System.out.println(stCompress(s));
	}
	
	public static String stCompress(String s){
		StringBuilder sb=new StringBuilder();
		char currChar=s.charAt(0);
		int count=1;
		for(int i=1; i<s.length(); i++){
			if(currChar == s.charAt(i)){
				count++;
			}else{
				sb.append(currChar);
				sb.append(count);
				currChar = s.charAt(i);
				count=1;
			}
		}
		sb.append(currChar);
		sb.append(count);		
		
		if (sb.length() < s.length()) return sb.toString();
		else	return s;
	}
	
	

}
