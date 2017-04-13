import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree {

    ArrayList<LinkedList<TreeNode>> findLevelLinkList(TreeNode root)
    {
        int level = 0;
        
        //result stores the result as a List of LinkedList<TreeNode>
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        //list initiation
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        
        //the level 0 list is just a root node
        list.add(root);
        result.add(level, list);
        
        while (true) {
            //list initiation again
            list = new LinkedList<TreeNode>();
            //for  each of the node in the previous list stored in the result
            for (int i = 0; i < result.get(level).size(); i++) {
                TreeNode n = (TreeNode) result.get(level).get(i);
                
                if (n != null) {
                    
                    if (n.left != null)
                        list.add(n.left);
                    if (n.right != null)
                        list.add(n.right);
                }
            }
            
            //if there is something stored in the list
            if (list.size() > 0) {
                //the new list is added into the result as the level+1 list
                result.add(level + 1, list);// public void add(int index, E element)
            } 
            else
            {
                break;//jump out of the while
            }
            
            level++;
        }
        return result;
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
