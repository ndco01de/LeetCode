package solution;

import util.TreeNode;

public class Q0112 {

	private boolean helper(TreeNode p, int targetSum) {

		targetSum -= p.val;

		if (p.left == null && p.right == null)
			return targetSum == 0 ? true : false;
		else if (p.left == null)
			return helper(p.right, targetSum);
		else if (p.right == null)
			return helper(p.left, targetSum);
		else // p.left != null && p.right != null
			return helper(p.left, targetSum) || helper(p.right, targetSum);
	}

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;
		return helper(root, targetSum);
	}

}
