import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Diameter {
    private static int maxDiameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        
        // Read node values
        int[] nodes = new int[n];
        System.out.print("Enter node values (use -1 for null): ");
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        
        // Build tree
        TreeNode root = buildTree(nodes);
        
        // Calculate diameter
        height(root);
        System.out.println("Diameter of the tree: " + maxDiameter);
    }

    // Build tree from level order input (-1 represents null)
    public static TreeNode buildTree(int[] nodes) {
        if (nodes.length == 0 || nodes[0] == -1) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(nodes[0]);
        queue.add(root);
        
        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();
            
            if (i < nodes.length && nodes[i] != -1) {
                current.left = new TreeNode(nodes[i]);
                queue.add(current.left);
            }
            i++;
            
            if (i < nodes.length && nodes[i] != -1) {
                current.right = new TreeNode(nodes[i]);
                queue.add(current.right);
            }
            i++;
        }
        
        return root;
    }

    // Calculate height and update maxDiameter
    public static int height(TreeNode root) {
        if (root == null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        // Update maximum diameter
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}