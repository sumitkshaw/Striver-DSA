import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// TreeNode class definition
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

public class BalancedTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildTree(nodes);
        boolean isBalanced = isBal(root); // Check if the tree is balanced
        System.out.println(isBalanced);    // Print the result
    }

    public static TreeNode buildTree(int[] nodes) {
        if (nodes.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < nodes.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < nodes.length) {
                current.left = new TreeNode(nodes[i++]);
                queue.offer(current.left);
            }

            // Right child
            if (i < nodes.length) {
                current.right = new TreeNode(nodes[i++]);
                queue.offer(current.right);
            }
        }
        return root;
    }

    public static boolean isBal(TreeNode root) {
        return height(root) != -1;  // Simplified return
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);

        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;  // Unbalanced
        }
        return Math.max(l, r) + 1;  // Return height
    }
}