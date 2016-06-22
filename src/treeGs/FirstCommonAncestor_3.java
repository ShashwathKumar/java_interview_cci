package treeGs;
import treeGs.FirstCommonAncestor.Node;
//no yet complete

public class FirstCommonAncestor_3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = FirstCommonAncestor.createTree();
		Node firstCommonAncestor = commonAncestor(root, root.left.right, root.left.left);
		
		if(firstCommonAncestor!=null) System.out.println(firstCommonAncestor.data);
		else System.out.println("Ancestor missing..!!");
	}
	public static Node commonAncestor(Node root, Node p, Node q){
		if(root==null) return null;
		if(root==p && root==q) return root;
		
		Node x = commonAncestor(root.left, p, q);
		if(x!=null && x!=p && x!=q) return x;
		Node y = commonAncestor(root.right, p, q);
		if(y!=null && y!=p && y!=q) return y;
		
	}

}
