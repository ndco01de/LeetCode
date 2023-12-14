package solution;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Q0144 {

	private List<Integer> rs = new ArrayList<>();

	private void helper(TreeNode p) {
		if (p == null)
			return;
		rs.add(p.val);
		helper(p.left);
		helper(p.right);
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		helper(root);
		return rs;
	}
}
