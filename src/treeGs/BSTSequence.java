package treeGs;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BSTSequence {
	private static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		Node root = createTree();
		//displayTree(root);
		
		ArrayList<ArrayList<Integer>> lists = createLists(root);
		printLists(lists);
		//displaySequences(lists);
	}
	
	public static ArrayList<ArrayList<Integer>> createLists(Node root){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> singleList = new ArrayList<Integer>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		
		while(!q.isEmpty()){
			n = q.poll();
			if(n==null){
				lists.add(singleList);
				singleList=new ArrayList<Integer>();
				if(!q.isEmpty()) q.add(null);
			}else{
				singleList.add(n.data);
				if(n.left!=null) q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
		
		return lists;
	}
	
	public static void printLists(ArrayList<ArrayList<Integer>> lists){
		for(ArrayList<Integer> singleList: lists){
			System.out.println(singleList);
		}
	}
	
	public static Node createTree(){
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(6);
		Node f = new Node(7);
		Node g = new Node(8);
		
		b.left = a;
		b.right = c;
		f.left = e;
		f.right = g;
		d.left = b;
		d.right = f;
		
		return d;
	}
	
	public static void displayTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		
		while(!q.isEmpty()){
			n = q.remove();
			if(n==null){
				System.out.println();
				if(!q.isEmpty()) q.add(n);
			}else{
				System.out.print(n.data);
				System.out.print(" ");
				if(n.left!=null) q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
	}
	

}
