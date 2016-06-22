package treeGs;
import java.util.LinkedList;
import java.util.Queue;
//this code is without the link to parent

public class FirstCommonAncestor {
	public static class Node{
		int data;
		int visited;
		Node left;
		Node right;
		public Node(int data){
			this.data = data;
			visited = 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		//displayTree(root);
		
		Node ancestor = firstCommonAncestor(root, root.left.left, root.left.left.left);
		if(ancestor==null)	System.out.println("No ancestor");
		else 				System.out.println(ancestor.data);
	}
	
	public static Node firstCommonAncestor(Node root, Node n1, Node n2){
		//search for n1
		firstSearch(root, n1);
		
		//search for n2
		Node ancestor = secondSearch(root, n2);
		return ancestor;
	}
	
	public static Node firstSearch(Node root, Node n){
		if(root==null) return null;
		if(root==n){
			root.visited=1;
			return n;
		}
		
		Node left = firstSearch(root.left , n);
		Node right= firstSearch(root.right, n);
		
		if(left!=null || right!=null){
			root.visited=1;
			return root;
		}else return null;
	}
	
	public static Node secondSearch(Node root, Node n){
		if(root==null) return null;
		if(root==n)    return n;
		
		Node left = secondSearch(root.left , n);
		Node right= secondSearch(root.right, n);
		
		Node childAncestor = (left!=null)?left: right;
		
		if(childAncestor==null) return null;
		else{
			if(childAncestor.visited==1) return childAncestor;
			else						 return root;
		}
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
		Node i = new Node(9);
		
		b.left = a;
		f.right= g;
		
		c.left = b;
		c.right= d;
		
		h.left = f;
		h.right= i;
		
		e.left = c;
		e.right= h;
		
		return e;
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
				if(n.left!=null) q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
		}
	}
}
