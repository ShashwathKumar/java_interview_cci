package treeGs;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class ListOfDepths {

	private static ArrayList<ArrayList<TreeNode>> list = new ArrayList<ArrayList<TreeNode>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = MyTreeDemo.init();
		displayTree(root);
		
		System.out.println();
		createLists(root);
		displayLists();
	}

	public static void createLists(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
		TreeNode n;
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			n = q.remove();
			if(n==null){
				list.add(arr);
				arr = new ArrayList<TreeNode>(); //I am doubtful abt this line
				if(!q.isEmpty()) q.add(null);
			}else{
				arr.add(n);
				if(n.left != null) q.add(n.left);
				if(n.right!= null) q.add(n.right);
			}
		}
	}

	public static void displayLists(){
		
		for(ArrayList<TreeNode> l : list){
			System.out.println();
			int size = l.size();
			System.out.print("[");
			for(TreeNode n: l){
				System.out.print(n.data);
				if(n != l.get(size-1))System.out.print(" ");
			}
			System.out.print("]");
		}
	}
	
	private static void displayTree(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		TreeNode n;
	
		while(!q.isEmpty()){
			//System.out.println(q);
			n=q.remove();
			if(n==null && !q.isEmpty()){
				q.add(null);
				System.out.println();
			}else if(n!=null){
				System.out.print(n.data);
				System.out.print(" ");
				if(n.left != null)q.add(n.left);
				if(n.right != null)q.add(n.right);
			}
		}
	}

}
