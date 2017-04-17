
public class BinaryTree {

	public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (covers(root.left, p) && covers(root.left, q))
			return commonAncestor(root.left, p, q);
		if (covers(root.right, p) && covers(root.right, q))
			return commonAncestor(root.right, p, q);
		return root;
	}
	
	 //return the result : is p a child of root? 
	private boolean covers(TreeNode root,TreeNode p) {
		if (root == null)
			return false;
		if (root == p)
			return true;
		return covers(root.left, p) || covers(root.right, p);
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	TreeNode parent;

	TreeNode(int v) {
		value = v;
	}

	int value;
}
