package treeGs;
import treeGs.FirstCommonAncestor.Node;

//This is according to solution #3 of CCI
//Trying to find the node where the 2 node diverge
//working -- O(n)

public class FirstCommonAncestor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = FirstCommonAncestor.createTree();
		Node firstCommonAncestor = commonAncestor(root, root.left.left, root.left.left);
		if(firstCommonAncestor!=null)System.out.println(firstCommonAncestor.data);
		else System.out.println("Ancestor missing..!!");
	}
	
	public static Node commonAncestor(Node root, Node p, Node q){
		if(!(covers(root,p)||covers(root,q))){
			return null;
		}
		return ancesHelper(root,p,q);
	}
	
	public static Node ancesHelper(Node root, Node p, Node q){
		System.out.println("ancesHelper");
		if(root==null) return null;
		if(root==p) return p;
		if(root==q) return q;
		
		boolean pOnLeft = covers(root.left,p);
		boolean qOnLeft = covers(root.left,q);
		
		if(pOnLeft != qOnLeft) return root;
		
		if(pOnLeft) return ancesHelper(root.left, p, q);
		else        return ancesHelper(root.right,p, q);
	}
	
	public static boolean covers(Node root, Node n){
		System.out.println("covers");
		if(root==null) return false;
		if(root==n)    return true;
		return covers(root.left,n)||covers(root.right,n);
	}

}
