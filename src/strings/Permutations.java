package strings;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import strings.ArrToHashmap;

public class Permutations {
	private static ArrayList<Integer> toPrint = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1, 2, 3, 4};
		List<Integer> arr = Arrays.asList(a);
		HashMap<Integer, Integer> hm = ArrToHashmap.arrToHm(arr);
        permutations(hm);
	}
	
	public static void permutations(HashMap<Integer, Integer> hm){
		HashMap<Integer, Integer> tempHm = new HashMap<Integer, Integer>();
		Integer val;
		Integer key;
		
		for(Map.Entry<Integer, Integer> pair: hm.entrySet()){
			val = pair.getValue();
			if(val==0) continue;
			key=pair.getKey();
			toPrint.add(key);
			val--;
			tempHm.putAll(hm);
			tempHm.put(key, val);
			if(allClear(tempHm)){
				System.out.println(toPrint);
				return;
			}
			permutations(tempHm);
		}
	}
		
		public static boolean allClear(HashMap<Integer, Integer> _hm){
			for(Map.Entry<Integer, Integer> pair: _hm.entrySet()){
				if(pair.getValue()>0) return false;
			}
			return true;
		}

}

