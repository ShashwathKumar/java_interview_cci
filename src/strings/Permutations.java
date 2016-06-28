package strings;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
	private static ArrayList<Character> toPrint = new ArrayList<Character>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1, 2, 3, 4};
		List<Integer> arr = Arrays.asList(a);
        permutations(arr);
	}
	
	public static void permutations(List<Integer> arr){
		List<Integer> tempArr = new ArrayList<Integer>();
		int len=arr.size();
		for(int i=0; i<len; i++){
			toPrint.add((Character)(char)(int)(arr.get(i)));
			toPrint.add(',');
			toPrint.add(' ');
			for(Integer n: arr){
				tempArr.add(new Integer(n));
			}
			tempArr.remove(i);
			permutations(tempArr);
		}
	}

}
