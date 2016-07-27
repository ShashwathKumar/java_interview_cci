package treeGs;
import java.util.Queue;
import java.util.LinkedList;

public class PathWithSum {
	protected static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this. data = data;
		}
	}
	private static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		printTree(root);
		int sum = 10;
		System.out.println("-------------------------------");
		cntPaths(root, sum);
		System.out.println("The number of paths is: "+cnt);
	}
	
	public static void cntPaths(Node root, int sum){
		cntPaths(root, sum, 0);
	}
	public static void cntPaths(Node root, int sum, int currSum){
		if(root==null) return;
		if(root.left != null) cntPaths(root.left,  sum, currSum);
		if(root.right!= null) cntPaths(root.right, sum, currSum);
		currSum += root.data;
		if(currSum==sum){
			System.out.println(root.data);
			cnt++;
		}
		if(root.left != null) cntPaths(root.left,  sum, currSum);
		if(root.right!= null) cntPaths(root.right, sum, currSum);
	}
	
	public static void printTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		Node n;
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			n = q.poll();
			if(n==null){
				System.out.println();
				if(!q.isEmpty()) q.add(null);
			}else{
				System.out.print(n.data+" ");
				if(n.left  != null) q.add(n.left);
				if(n.right != null) q.add(n.right);
			}
		}
	}
	
	public static Node createTree(){
		Node a = new Node(5);
		Node b = new Node(8);
		Node c = new Node(3);
		Node d = new Node(-3);
		Node e = new Node(1);
		Node f = new Node(2);
		Node g = new Node(2);
		Node h = new Node(-1);
		Node i = new Node(1);
		
		h.left = i;
		e.left  = g;
		f.right = h;
		b.left  = d;
		b.right = e;
		c.left  = f;
		a.left  = b;
		a.right = c;
		
		return a;
	}
}
