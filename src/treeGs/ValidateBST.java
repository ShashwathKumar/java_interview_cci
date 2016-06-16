package treeGs;
import java.util.Queue;
import java.util.LinkedList;

public class ValidateBST {

	private static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		displayTree(root);
		
		System.out.println(validateBST(root));
	}
	
	public static boolean validateBST(Node root){
		return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean validateBST(Node root, Integer min, Integer max){
		if(root==null) return true;
		if(root.data<=min || root.data>max){
			return false;
		}
		
		return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
	}
	
	public static void displayTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		
		while(!q.isEmpty()){
			n=q.poll();
			if(n==null){
				System.out.println();
				if(!q.isEmpty()) q.add(null);
			}else{
				System.out.print(n.data);
				System.out.print(" ");
				if(n.left!=null) q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
	}
	
	public static Node createTree(){
		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(7);
		Node d = new Node(3);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(9);
		Node h = new Node(2);
		
		d.left=h;
		b.left=d;
		b.right=e;
		c.left=f;
		c.right=g;
		a.left=b;
		a.right=c;
		
		return a;
	}
	
	

}
