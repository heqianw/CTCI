package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Solution to 4.3. Create a linked list of all nodes of each depth of a binary tree
public class ListDepth {
	//Both bfs and dfs can be used. 
	//bfs is to iterate over the list and the moment we reach depth + 1, we know that we have all the elements of previous depth.
	//bfs goes through one level at a time
	//dfs is to recurse through tree, then pass depth + 1 for next call
	//dfs goes through one depth and goes back up.
	
	//BFS should be easier to implement -> one LL at a time
	public LinkedList<BTNode> listDepth(BTNode root) {
		ArrayList<LinkedList<BTNode>> result = new ArrayList<LinkedList<BTNode>>();
		LinkedList<BTNode> currentList = new LinkedList<BTNode>();
		if(root != null) {
			currentList.add(root);
		}
		while (!currentList.isEmpty()) {
			result.add(currentList);
			LinkedList<BTNode> oldRow = currentList;
			currentList = new LinkedList<BTNode>();
			for(BTNode n : oldRow) {
				if(n.left != null)
					currentList.add(n.left);
				if(n.right != null)
					currentList.add(n.right);
			}
		}
		return null;
	}
}
