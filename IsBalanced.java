
public class IsBalanced {

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	public static boolean isBalanced(TreeNode root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}
	
	public static void main(String [] args)
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.right.right=new TreeNode(5);
		root.right.right.right=new TreeNode(7);
		System.out.println("Is it a balanced tree? "+isBalanced(root));
		System.out.println("The height of the tree is : "+maxDepth(root));
		
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	
	TreeNode(int v)
	{
		value=v;
	}
	int value;
}
/*
Is it a balanced tree? false
The height of the tree is : 4
*/
