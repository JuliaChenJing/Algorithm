public class BinaryTree {

    public static TreeNode inorderSucc(TreeNode e) {
        if (e == null)
            return null;

        TreeNode p;
        // Found right children ‐> return 1st inorder node on right
        if (e.parent == null || e.right != null) {
            p = leftMostChild(e.right);
        } 
        else {

            // Go up until we’re on left instead of right (case 2b)
            while ((p = e.parent) != null)
            {
                if (p.left == e)
                {
                    break;
                }
                e = p;
            }
        }
        return p;

    }

    // find the left most child of the tree which has the parent node as e
    public static TreeNode leftMostChild(TreeNode e) {
        if (e == null)
            return null;
        while (e.left != null)
            e = e.left;
        return e;
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
}return e;
 }
