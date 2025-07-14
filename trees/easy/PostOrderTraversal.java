import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class PostOrderTraversal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nodes = new int[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = scanner.nextInt();
        }
        scanner.close();
        
        TreeNode root = BuildTree(nodes);
        System.out.println("Postorder: ");
        postorder(root);
        scanner.close();
    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " "); // Changed to print without newline
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
}