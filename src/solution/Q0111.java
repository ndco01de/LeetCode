package solution;

import util.TreeNode;

public class Q0111 {

	private int helper(TreeNode p) {

		if (p.left == null && p.right == null)
			return 1;

		if (p.left == null)
			return helper(p.right) + 1;
		if (p.right == null)
			return helper(p.left) + 1;

		return Math.min(helper(p.left), helper(p.right)) + 1;
	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		return helper(root);
	}

}
