package solution;

import util.TreeNode;

public class Q0965 {

	private int checkValue;
	
	private boolean search(TreeNode node) {
		if(node==null)
			return true;
		if(node.val!=checkValue)
			return false;
		return search(node.left) && search(node.right);
	}
	
    public boolean isUnivalTree(TreeNode root) {
    	checkValue=root.val;
    	return search(root);
    }
    
    
    
}