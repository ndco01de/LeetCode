package solution;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Q0094 {

	private ArrayList<Integer> rs = new ArrayList<>();

	private void helper(TreeNode p) {
		if(p==null)	return;
		helper(p.left);
		rs.add(p.val);
		helper(p.right);
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		helper(root);
		return rs;
	}

}
