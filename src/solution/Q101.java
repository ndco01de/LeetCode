package solution;

import util.TreeNode;

public class Q101 {

	private boolean helper(TreeNode p,TreeNode q) {
		if (p == null && q == null)	return true;
		if (p == null || q == null)	return false;
		if (p.val != q.val)			return false;
		return helper(p.left, q.right) && helper(p.right, q.left);
	}
	
	public boolean isSymmetric(TreeNode root) {
		return helper(root.left,root.right);
	}
	
}
