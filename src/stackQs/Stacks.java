package stackQs;

import java.util.ArrayList;

public class Stacks {
	private static ArrayList<Integer> S;
	private static int top1, top2, top3, topNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		push(1, 3);
		push(1, 5);
		push(1, 7);
		printEm();
		pop(1);
		printEm();
	}
	
	public static void push(int topNum, int val){
		switch(topNum){
			case 1: top1 += 3; S.set(top1, val);  break;
			case 2: top2 += 3; S.set(top2, val);  break;
			case 3: top3 += 3; S.set(top3, val);  break;
		}
	}
	
	public static int pop(int topNum){
		int res = Integer.MIN_VALUE;
		
		switch(topNum){
			case 1: res = S.get(top1); top1 -= 3; break;
			case 2: res = S.get(top2); top2 -= 3; break;
			case 3: res = S.get(top3); top3 -= 3; break;
		}
		return res;
	}
	
	public static void printEm(){
		printStack(1);
		printStack(2);
		printStack(3);
		System.out.println("-------------------");
	}
	
	public static void printStack(int topNum){
		int top=0;
		switch(topNum){
		case 1: top = top1; break;
		case 2: top = top2; break;
		case 3: top = top3; break;
	}		
		
		System.out.print("[");
		for(;top>2; top=top-3){
			System.out.print(S.get(top));
			if(top>5) System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void init(){
		S = new ArrayList<Integer>();
		top1 = 0;
		top2 = 1;
		top3 = 2;
		for(int i=0; i<=20; i++){
			S.add(-1*i);
		}
	}
	
}
