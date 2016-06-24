package treeGs;
import treeGs.FirstCommonAncestor.Node;
//there is too much thinking involved here. I may not think of this during interview.
//no yet complete
//Buggy -- there will be a problem if the nodes provided are not in the tree
//simplest solution wud be to verify that nodes exist before u start executing -- but this is not the most efficient way

public class FirstCommonAncestor_3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = FirstCommonAncestor.createTree();
		Node firstCommonAncestor = commonAncestor(root, root.left.left.left, root.left.left);
		
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
		
		if(x!=null && y!=null) return root;
		else if(root==p || root==q) return root;
		else return x==null? y:x;
	}

}
