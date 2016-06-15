package treeGs;

import java.util.ArrayList;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		b.add(a);
		System.out.println(b.get(0));
		a = new ArrayList<Integer>();
		System.out.println(a);
		System.out.println(b.get(0));
	}

}
