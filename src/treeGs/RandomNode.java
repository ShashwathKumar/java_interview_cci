package treeGs;

public class RandomNode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNodeTree tree = new RandomNodeTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.display();
		System.out.println("---------------");
		
		tree.delete(3);
		tree.display();
		System.out.println("---------------");
		
		Node foundNode = tree.find(2);
		System.out.println(foundNode.data);
		System.out.println("---------------");
		
		Node randomNode = tree.getRandomNode();
		System.out.println(randomNode.data);
		System.out.println("---------------");
	}
}
