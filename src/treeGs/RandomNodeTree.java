package treeGs;
import java.util.Queue;
import java.util.LinkedList;

public class RandomNodeTree {
	private static int numOfNodes;
	private static Node root;
	public RandomNodeTree(){
		numOfNodes = 0;
	}
	public static Node getRandomNode(){
		int random = (int)(Math.random()*numOfNodes+1);
		Queue<Node> q = new LinkedList<Node>();
		Node n=new Node(Integer.MIN_VALUE);
		q.add(root);
		while((random!=0) && (!q.isEmpty())){
			//System.out.println(random);
			n = q.remove();
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
			random--;
		}
		//System.out.println(random);
		if(random!=0) return null;
		else return n;
	}
	
	public static void insert(int data){
		Node newNode = new Node(data);
		if(root==null){
			root=newNode;
			numOfNodes = 1;
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		Node n;
		q.add(root);
		while(!q.isEmpty()){
			n = q.remove();
			if(n.left==null){
				n.left=newNode;
				numOfNodes++;
				return;
			}else{
				q.add(n.left);
			}
			
			if(n.right==null){
				n.right=newNode;
				numOfNodes++;
				return;
			}else{
				q.add(n.right);
			}
		}
	}
	
	public static Node find(int data){
		return find(root,data);
	}
	public static Node find(Node n, int data){
		if(n==null) return null;
		if(n.data==data) return n;
		else{
			Node left  = find(n.left,data);
			Node right = find(n.right,data);
			Node foundNode = (left!=null)?left:right;
			return foundNode;
		}
	}
	
	public static void delete(int data){
		if(root==null) return;
		Node foundNode = find(data);
		if(foundNode==null) return;
		Queue<Node> q = new LinkedList<Node>();
		Node n=new Node(Integer.MIN_VALUE);
		q.add(root);
		while(!q.isEmpty()){
			n = q.remove();
			if(n.left!=null) q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		foundNode.data=n.data;
		n=null;
		numOfNodes--;
	}
	
	public static void display(){
		Queue<Node> q = new LinkedList<Node>();
		Node n;
		if(root==null) return;
		q.add(root);
		q.add(null);
		 while(!q.isEmpty()){
			 n = q.poll();
			 if(n==null){
				 System.out.println();
				 if(!q.isEmpty()) q.add(null);
			 }else{
				 System.out.print(n.data+" ");
				 if(n.left!=null) q.add(n.left);
				 if(n.right!=null)q.add(n.right);
			 }
		 }
		
	}
}
