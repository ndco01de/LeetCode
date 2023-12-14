package solution;

import util.TreeNode;

public class Q0404 {

	private int left(TreeNode p) {
		if (p == null)
			return 0;
		else if (p.left == null && p.right == null)
			return p.val;
		else
			return left(p.left) + right(p.right);
	}

	private int right(TreeNode p) {
		return p == null ? 0 : left(p.left) + right(p.right);
	}

	public int sumOfLeftLeaves(TreeNode root) {
		return left(root.left) + right(root.right);
	}

}
