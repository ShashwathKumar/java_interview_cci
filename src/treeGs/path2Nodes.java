package treeGs;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

//in this program though I have implemented the State for the nodes
//its not completely necessary since I am returning as soon as I get
//the destination node

public class path2Nodes {
	enum State {UNVISITED, VISIT_STARTED, VISIT_FINISHED};
	private static class Node{
		State state;
		String name;
		ArrayList<Node> adjList = new ArrayList<Node>();
		public Node(String name){
			this.name=name;
			this.state=State.UNVISITED;
			//this.adjList=null;
		}
	}
	private static ArrayList<Node> graph = new ArrayList<Node>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node srcNode=init();
		display(graph);
		System.out.println(findPath(srcNode,"d"));
		//displayFromNode(srcNode);
	}
	
	private static boolean findPath(Node srcNode, String dest){
		Queue<Node> q = new LinkedList<Node>();
		Node n;
		q.add(srcNode);
		//int count=1;
		//System.out.println(srcNode.name+" visited");
		
		while(!q.isEmpty()){
			//System.out.println(count);
			
			n=q.remove();
			System.out.println(n.name+" visited");
			System.out.println(n.state);
			n.state=State.VISIT_STARTED;
			System.out.println(n.state);
			for(Node e : n.adjList){
				//System.out.println(n.adjList);
				if(e.name.compareTo(dest)==0){
					System.out.println(e.name+" found");
					return true;
				}
				if(e.state==State.UNVISITED) q.add(e);
			}
			for(Node item: q){
				System.out.print(item.name+", ");
			}
			//display(graph);
			System.out.println();
			n.state=State.VISIT_FINISHED;
			
			//count++;
		}
		return false;
	}
	
	/*private static Node init(){
		Node node = new Node("b");
		node.adjList.add(new Node("a"));
		node.adjList.add(new Node("f"));
		//node.adjList.add(new Node("d"));
		graph.add(node);
		node=new Node("c");
		node.adjList.add(new Node("b"));
		node.adjList.add(new Node("d"));
		node.adjList.add(new Node("e"));
		graph.add(node);
		graph.add(new Node("d"));
		graph.add(new Node("e"));
		graph.add(new Node("f"));
		
		node=new Node("a");
		node.adjList.add(new Node("b"));
		node.adjList.add(new Node("c"));
		Node srcNode = node;
		graph.add(node);
		return srcNode;
	}*/
	
	private static Node init(){
		Node a = new Node("a");
		Node b = new Node("b");  
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		
		b.adjList.add(a);
		b.adjList.add(f);
		//node.adjList.add(new Node("d"));
		
		c.adjList.add(b);
		c.adjList.add(d);
		c.adjList.add(e);
		
		a.adjList.add(b);
		a.adjList.add(c);
		
		graph.add(c);
		graph.add(d);
		graph.add(e);
		graph.add(f);
		graph.add(b);
		graph.add(a);
		Node srcNode = a;
		return srcNode;
	}
	
	private static void display(ArrayList<Node> gr){
		System.out.println();
		for(Node node: gr){
			System.out.print(node.name+"--->");
			for(Node adj: node.adjList)
				System.out.print(adj.name);
			System.out.print("---->"+node.state);
			System.out.println();
		}
	}
	
	private static void displayFromNode(Node srcNode){
		Queue<Node> q = new LinkedList<Node>();
		q.add(srcNode);
		q.add(null);
		Node e;
		
		while(!q.isEmpty()){
			e = q.remove();
			if(e==null){
				System.out.println();
				if(!q.isEmpty()) q.add(null);
			}else{
				System.out.print(e.name);
				System.out.print(" ");
			for(Node n: e.adjList){
				q.add(n);
			}
			}
		}
	}
}
