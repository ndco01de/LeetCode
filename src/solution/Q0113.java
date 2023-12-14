package solution;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Q0113 {

	private List<List<Integer>> result = new ArrayList<>();

	private void helper(TreeNode p, List<Integer> list, int targetSum) {

		list.add(p.val);
		targetSum -= p.val;

		if (p.left == null && p.right == null) {
			if (targetSum == 0)
				result.add(list);
		} else if (p.left == null)
			helper(p.right, list, targetSum);
		else if (p.right == null)
			helper(p.left, list, targetSum);
		else { // p.left != null && p.right != null
			helper(p.left, new ArrayList<>(list), targetSum);
			helper(p.right, list, targetSum);
		}
	}

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root != null)
			helper(root, new ArrayList<>(), targetSum);
		return result;
	}
}
