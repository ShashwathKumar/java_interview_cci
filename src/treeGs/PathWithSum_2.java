package treeGs;
import treeGs.PathWithSum;
import java.util.HashMap;

public class PathWithSum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathWithSum.Node root = PathWithSum.createTree();
		PathWithSum.printTree(root);
		int targetSum = 10, numOfPaths;
		numOfPaths = cntPaths(root, targetSum);
		System.out.println("no. of paths: "+numOfPaths);
	}
	private static int cntPaths(PathWithSum.Node root, int targetSum){
		if(root==null) return 0;
		HashMap<Integer, Integer> pathCnt = new HashMap<Integer, Integer>();
		incHashMap(pathCnt, 0, 1);
		return cntPaths(root, targetSum, 0, pathCnt);
	}
	private static int cntPaths(PathWithSum.Node node, int targetSum, int runningSum, HashMap<Integer, Integer> pathCnt){
		if(node==null) return 0;
		
		runningSum += node.data;
		incHashMap(pathCnt, runningSum, 1);
		
		int sum = runningSum - targetSum;
		int totalPaths = pathCnt.containsKey(sum)?pathCnt.get(sum): 0;
		
		totalPaths += cntPaths(node.left, targetSum, runningSum, pathCnt);
		totalPaths += cntPaths(node.right, targetSum, runningSum, pathCnt);
		
		incHashMap(pathCnt, runningSum, -1);
		return totalPaths;
	}
	private static void incHashMap(HashMap<Integer, Integer> pathCnt, int key, int delta){
		if(!pathCnt.containsKey(key)){
			pathCnt.put(key, 0);
		}
		else pathCnt.put(key, pathCnt.get(key)+delta);
	}

}
