package treeGs;
import java.util.Queue;
import java.util.LinkedList;

public class InOrderSuccessor {

	private static class Node{
		int data;
		Node left;
		Node right;
		Node parent;
		public Node(int data){
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		displayTree(root);
		
		Node n = inorderSuccessor(root.left.left);
		System.out.print("InOrderSuccessor = ");
		System.out.println(n.data);
	}
	
	public static Node inorderSuccessor(Node src){
		Node dest;
		
		if(src.right!=null){
			dest=src.right;
			while(dest.left!=null){
				dest=dest.left;
			}
		}else if(src.parent!=null){
			dest=src.parent;
			while(dest.right==src){
				src=dest;
				dest=src.parent;
			}
		}
		else dest = new Node(-1);
		
		return dest;
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
		a.parent = b;
		
		f.right= g;
		g.parent = f;
		
		c.left = b;
		c.right= d;
		b.parent=c;
		d.parent=c;
		
		h.left = f;
		h.right= i;
		f.parent=h;
		i.parent=h;
		
		e.left = c;
		e.right= h;
		c.parent=e;
		h.parent=e;
		
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
