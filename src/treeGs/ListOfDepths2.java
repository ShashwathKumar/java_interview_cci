package treeGs;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

//This is a working code
//I unbelievably got it working in the first time :)

public class ListOfDepths2 {

	private static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	private static ArrayList<ArrayList<Node>> lists = new ArrayList<ArrayList<Node>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		displayTree(root);
		
		createLists(root);
		printLists();
	}
	
	public static void createLists(Node root){
		Queue<Node> q = new LinkedList<Node>();
		ArrayList<Node> arr = new ArrayList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		
		while(!q.isEmpty()){
			n=q.poll();
			
			if(n==null){
				lists.add(arr);
				arr = new ArrayList<Node>();
				if(!q.isEmpty()) q.add(null);
			}else{
				arr.add(n);
				if(n.left!=null) q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
	}
	
	public static void printLists(){
		for(ArrayList<Node> list: lists){
			int size = list.size();
			int cnt=0;
			System.out.println();
			System.out.print("[");
			for(Node n: list){
				System.out.print(n.data);
				cnt++;
				if(cnt!=size) System.out.print(" ");
			}
			System.out.print("]");
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
		Node h = new Node(9);
		
		d.left = h;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		a.left = b;
		a.right = c;
		
		return a;
	}
	
	public static void displayTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		
		while(!q.isEmpty()){
			n = q.poll();
			if(n==null){
				System.out.println();
				if(!q.isEmpty()) q.add(null);
			}else{
				System.out.print(n.data);
				System.out.print(" ");
				if(n.left != null) q.add(n.left);
				if(n.right != null)q.add(n.right);
			}
		}
	}
	

}
