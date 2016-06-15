package treeGs;

public class MyBinaryTree {

		TreeNode root;
		
		public MyBinaryTree(){
			root = null;
		}
		public MyBinaryTree(TreeNode root){
			this.root = root;
		}
		
		public void visit(TreeNode n){
			System.out.print(n.data);
			System.out.print(" ");
		}
		
		public void preOrder(TreeNode root){
			if(root==null) return;
			visit(root);
			preOrder(root.left);
			preOrder(root.right);
		}
}
