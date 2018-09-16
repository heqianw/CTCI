package chapter4;

//Solution to problem 4.4. Check if binary tree is balanced.
//Brute force solution to just check everything, check heights all each subtree
public class CheckBalanced {

	private int checkHeight (BTNode root) {
		if(root == null)
			return -1;
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		int heightDiff = leftHeight - rightHeight;
		if (Math.abs(heightDiff) > 1) 
			 return Integer.MIN_VALUE;
		else
			return Math.max(leftHeight, rightHeight) + 1;
	}
	public boolean isBalanced (BTNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
}
