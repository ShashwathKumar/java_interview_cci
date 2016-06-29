package strings;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class ArrToHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1, 1, 2, 3, 4, 5};
		List<Integer> arr = Arrays.asList(a);
		HashMap<Integer, Integer> hm = arrToHm(arr);

		for(Map.Entry<Integer, Integer> pair: hm.entrySet() ){
			System.out.println(pair.getKey()+" "+pair.getValue());
		}
	}
	
	public static HashMap<Integer, Integer> arrToHm(List<Integer> arr){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Integer val;
		
		for(Integer num: arr){
			if(hm.containsKey(num)){
				val = hm.get(num);
				val++;
				hm.put(num, val);
			}else{
				hm.put(num,1);
			}
		}
		return hm;
	}

}
