package chapter4;

//Solution to 4.2
//Given a sorted Array, find algorithm to create a BST with minimal Height.
//Assume we return the root node
public class MinimalTree {

	//Since array is already sorted: the middle is the root node.
	//everytime we recursively call this function, the new middle of the subsection becomes the new root of the subtree
	//so on until we get to when the start/end index tells us to stop
	
	//Recursively, this is very simple to execute, just need to keep track of the left/right index starts and we cool
	public BTNode minTree(int[] sorted, int start, int end) {
		if(start > end) {
			return null;
		}
		int center = (start + end) / 2;
		BTNode root = new BTNode(sorted[center]);
		root.left = minTree(sorted, start, center - 1);
		root.right = minTree(sorted, center + 1, end);
		return root;
	}
	
}
