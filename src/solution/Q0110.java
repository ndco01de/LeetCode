package solution;

import util.TreeNode;

public class Q0110 {

	private int helper(TreeNode p) {

		if (p == null)
			return 0;

		int left = helper(p.left);
		int right = helper(p.right);

		if (left == -1 || right == -1 || Math.abs(left - right) > 1)
			return -1;
		else
			return Math.max(left, right) + 1;
	}

	public boolean isBalanced(TreeNode root) {
		return helper(root) != -1;
	}

}
