package treeGs;
import java.util.Queue;
import java.util.LinkedList;

public class CheckBalanced {

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
		
		System.out.println(checkBalanced(root));
	}
	
	public static boolean checkBalanced(Node root){
		int leftDepth = findDepth(root.left);
		int rightDepth = findDepth(root.right);
		
		if(Math.abs(leftDepth-rightDepth)>1) return false;
		return true;
	}
	
	public static int findDepth(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		int depth=0;
		
		while(!q.isEmpty()){
			n=q.poll();
			if(n==null){
				depth++;
				if(!q.isEmpty()) q.add(null);
			}else{
				if(n.left!=null) q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
		
		return depth;
	}
	
	public static Node createTree(){
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		
		h.right = g;
		d.left = h;
		b.left = d;
		b.right = e;
		c.left = f;
		//c.right = g;
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
			n=q.poll();
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
