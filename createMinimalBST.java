public class BinaryTree {
    
    //create minimal binary search tree
    public static TreeNode createMinimalBST(int array[]) {
        return addToTree(array, 0, array.length - 1);
    }


    //the helper class
    public static TreeNode addToTree(int arr[], int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;//they are all the reference in the array
        TreeNode n = new TreeNode(arr[mid]);
        n.left = addToTree(arr, start, mid - 1);
        n.right = addToTree(arr, mid + 1, end);
        return n;
    }


    
}


class TreeNode {
    TreeNode left;
    TreeNode right;

    TreeNode(int v) {
        value = v;
    }

    int value;
}
