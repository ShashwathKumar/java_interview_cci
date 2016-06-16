package treeGs;
import java.util.List;
import java.util.Queue;

//import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;

public class TreeFromArray_2 {
	private static class Node{
		Integer dat;
		Node left;
		Node right;
		
		public Node(Integer dat){
			this.dat=dat;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//System.out.println(a);
		Node root = treeFromArray(a);
		displayTree(root);
	}
	
	public static Node treeFromArray(Integer[] b){
		return treeFromArray(b, 0, b.length-1);
	}
	
	public static Node treeFromArray(Integer[] b, int start, int end){
		if(end < start) return null;
		
		int mid = (start+end)/2;
		Node node = new Node(b[mid]);
		node.left = treeFromArray(b, start, mid-1);
		node.right = treeFromArray(b, mid+1, end);
		return node;
	}

	private static void displayTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
	
		while(!q.isEmpty()){
			//System.out.println(q);
			n=q.remove();
			if(n==null && !q.isEmpty()){
				q.add(null);
				System.out.println();
			}else if(n!=null){
				System.out.print(n.dat);
				System.out.print(" ");
				if(n.left != null) q.add(n.left);
				if(n.right!= null) q.add(n.right);
			}
		}
	}
}
