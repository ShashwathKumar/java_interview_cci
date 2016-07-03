package treeGs;

public class CheckSubtree {

	private static class Node{
		char data;
		Node left;
		Node right;
		public Node(char data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = createTree1();
		Node root2 = createTree2();
		System.out.println(checkSubtree(root1, root2));
	}
	
	public static boolean checkSubtree(Node root1, Node root2){
		if(root1==null) return false;
		if(root1.data == root2.data){
			if(checkSubtreeStart(root1,root2)==true) return true;
		}else{
			if(checkSubtree(root1.left,root2)==true ||
			checkSubtree(root1.right,root2)==true) return true;
		}
		return false;
	}
	
	public static boolean checkSubtreeStart(Node root1, Node root2){
		if(root1==null && root2==null) return true;
		else if(root2==null) return true;   //This and the next statement is the key for this problem
		else if(root1==null) return false;
		else if(root1.data != root2.data){
			System.out.println(root1.data+" "+root2.data);
			return false;
		}
		else{
			System.out.println(root1.data+" "+root2.data);
			return checkSubtreeStart(root1.left, root2.left) &&
					checkSubtreeStart(root1.right, root2.right);
		}
	}
	
	
	public static Node createTree1(){
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		Node f = new Node('f');
		Node g = new Node('g');
		Node h = new Node('h');
		Node i = new Node('i');
		Node j = new Node('j');
		Node k = new Node('k');
		Node l = new Node('l');
		Node m = new Node('m');
		
		k.left  = m;
		d.left  = h;
		d.right = i;
		e.left  = j;
		e.right = k;
		f.right = l;
		b.left  = d;
		b.right = e;
		c.left  = f;
		c.right = g;
		a.left  = b;
		a.right = c;
		
		return a;
	}
	
	public static Node createTree2(){
		Node m = new Node('m');
		Node j = new Node('j');
		Node k = new Node('k');
		Node e = new Node('e');
		Node b = new Node('b');
		
		k.left = m;
		j.right = m; //for false condition
		e.left = j;
		e.right = k;
		b.right = e;
		
		return b;
	}

}
