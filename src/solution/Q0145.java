package solution;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Q0145 {

	private List<Integer> rs = new ArrayList<>();

	private void helper(TreeNode p) {
		if (p == null)
			return;
		helper(p.left);
		helper(p.right);
		rs.add(p.val);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		helper(root);
		return rs;
	}
}
