package solution;

import util.TreeNode;

public class Q0098 {

	private boolean helper(TreeNode p, long min, long max) {
		if (p == null)
			return true;
		if (p.val >= max || p.val <= min)
			return false;
		return helper(p.left, min, p.val) && helper(p.right, p.val, max);
	}

	public boolean isValidBST(TreeNode root) {
		return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

}
