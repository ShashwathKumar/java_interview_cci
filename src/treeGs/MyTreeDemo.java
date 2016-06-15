package treeGs;

public class MyTreeDemo {

	public static TreeNode init() {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(7);
		TreeNode h = new TreeNode(8);
		TreeNode i = new TreeNode(9);
		TreeNode j = new TreeNode(10);
		
		f.right = j;
		e.left = i;
		d.left = h;
		
		c.right = g;
		c.left = f;
		b.right = e;
		b.left = d;
		
		a.right = c;
		a.left = b;
		
		MyBinaryTree mBT = new MyBinaryTree(a);
		
		return a;
		//mBT.preOrder(a);
		//System.out.println();
		//preOrder(a);
	}
	
	public static void visit(TreeNode n){
		System.out.print(n.data);
		System.out.print(" ");
	}
	
	public static void preOrder(TreeNode root){
		if(root == null) return;
		visit(root);
		preOrder(root.left);
		preOrder(root.right);
	}

}
