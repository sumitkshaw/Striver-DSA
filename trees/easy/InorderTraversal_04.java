
import java.util.LinkedList;
import java.util.Queue;



class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}

public class InorderTraversal_04 {
    public static void main(String[] args) {
        
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }
    public static TreeNode buildTree(int [] nodes){
        if(nodes.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while(i<nodes.length){
            TreeNode current = queue.poll();

            // Left Child
            if(i < nodes.length){
                current.left = new TreeNode(nodes[i++]);
                queue.offer(current.left);
            }

            // Right Child
            if(i < nodes.length){
                current.right = new TreeNode(nodes[i++]);
                queue.offer(current.right);
            }
        }
        return root;
    }
}
