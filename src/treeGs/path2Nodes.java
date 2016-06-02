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
		System.out.println(findPath(srcNode,"d"));
	}
	
	private static boolean findPath(Node srcNode, String dest){
		Queue<Node> q = new LinkedList<Node>();
		Node n;
		q.add(srcNode);
		
		while(!q.isEmpty()){
			n=q.poll();
			n.state=State.VISIT_STARTED;
			for(Node e : n.adjList){
				if(e.name.compareTo(dest)==0){
					System.out.println(e.name);
					return true;
				}
				if(e.state==State.UNVISITED) q.add(e);
			}
			n.state=State.VISIT_FINISHED;
		}
		return false;
	}
	
	private static Node init(){
		Node node = new Node("a");
		
		node.adjList.add(new Node("b"));
		node.adjList.add(new Node("c"));
		Node srcNode = node;
		graph.add(node);
		node.name="b";
		node.adjList.add(new Node("a"));
		node.adjList.add(new Node("f"));
		node.adjList.add(new Node("d"));
		graph.add(node);
		node.name="c";
		node.adjList.add(new Node("b"));
		//node.adjList.add(new Node("d"));
		node.adjList.add(new Node("e"));
		graph.add(node);
		graph.add(new Node("d"));
		graph.add(new Node("e"));
		graph.add(new Node("f"));
		
		return srcNode;
	}

}
