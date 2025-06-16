import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}
public class PreorderTraversal_03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // number of nodes
        int n = sc.nextInt();
        int [] nodes = new int[n];
        for(int i=0; i<n; i++){
            int value = sc.nextInt();
            nodes[i] = (value == -1) ? 0 : value; // Assuming -1 indicates null
        }
        TreeNode root = BuildTree(nodes);
        System.out.println("Preorder Traversal:");
        preordertraversal(root);
        sc.close();

    }

    public static TreeNode BuildTree(int[]nodes){
        if(nodes.length==0){
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
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

    public static void preordertraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }

}
