package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringPermute {

	public static void main(){
		String st = "Hello";
		permutations(st);
	}
	
public static void permutations(String str) { 
    permutations("", str); 
}

private static void permutations(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

}