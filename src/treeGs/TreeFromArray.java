//Not working

package treeGs;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class TreeFromArray {
	private static class Node{
		Integer dat;
		Node left;
		Node right;
		
		public Node(Integer dat){
			this.dat=dat;
		}
	}
	private static List<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr=init(arr);
		System.out.println(arr);
		//Node root=buildBST(arr);
		//System.out.println(root.dat);
		//displayTree(root);
	}
	
	private static Node buildBST(List<Integer> arr){
		int size = arr.size();
		int size1, size2;
		Node root = nextNode(arr);	
		return root;
	}
	
	private static Node nextNode(List<Integer> a){
		int size=a.size();
		if(a.size()!=0){
		   int index = nextIndex(a, size);
	       Node node = (index<0 || index>size)?null:new Node(a.get(index));
	       if(node!=null){
	    	   node.left = (index==0 || index==size)?null:nextNode(a.subList(0, index-1));
	    	   node.right= (index==0 || index==size)?null:nextNode(a.subList(index+1, size-1));
	       }
	       return node;
		}
		return null;
	}
	
	private static int nextIndex(List<Integer> arr, int size){
		int root_index=size/2;
		/*int root_index1, root_index2;
		root_index1=root_index-1;
		root_index2=root_index+1;
		Integer val= (Integer)arr.get(root_index);
		
		while(root_index1>0 && arr.get(root_index1)==val) root_index1--;
		while(root_index2<size-1 && arr.get(root_index2)==val) root_index2++;
		
		if(root_index2 != root_index){
			root_index=(Math.abs(root_index2-root_index) < Math.abs(root_index1-root_index))? root_index2: root_index1;
		}*/
		return root_index;
	}
	
	private static void displayTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node n;
		
		while(!q.isEmpty()){
			n=q.remove();
			if(n==null && !q.isEmpty()){
				q.add(null);
				System.out.println();
			}else if(n!=null){
				System.out.print(n.dat);
				System.out.print(" ");
			}
		}
	}
	
	private static List<Integer> init(List<Integer> arr){
		Integer[] nums = {1, 4 ,2 ,5 ,6, 7, 2};
		arr = Arrays.asList(nums);
		Collections.sort(arr);
		return arr;
	}

}
 