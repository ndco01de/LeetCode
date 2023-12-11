package solution;

import util.TreeNode;

public class Q0100 {

	private boolean helper(TreeNode p, TreeNode q) {
		if (p == null && q == null)	return true;
		if (p == null || q == null)	return false;
		if (p.val != q.val)			return false;
		return helper(p.left, q.left) && helper(p.right, q.right);
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return helper(p,q);
	}

}
