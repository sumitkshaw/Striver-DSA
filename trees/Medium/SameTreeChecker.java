import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class SameTreeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First tree input
        System.out.println("Enter first tree details:");
        System.out.print("Number of nodes: ");
        int n1 = sc.nextInt();
        int[] nodes1 = new int[n1];
        System.out.print("Node values (-1 for null): ");
        for (int i = 0; i < n1; i++) {
            nodes1[i] = sc.nextInt();
        }
        TreeNode root1 = BuildTree(nodes1);

        // Second tree input
        System.out.println("\nEnter second tree details:");
        System.out.print("Number of nodes: ");
        int n2 = sc.nextInt();
        int[] nodes2 = new int[n2];
        System.out.print("Node values (-1 for null): ");
        for (int i = 0; i < n2; i++) {
            nodes2[i] = sc.nextInt();
        }
        TreeNode root2 = BuildTree(nodes2);

        // Check if trees are identical
        boolean result = isSameTree(root1, root2);
        System.out.println("\nAre the trees identical? " + result);

        sc.close();
    }

    public static TreeNode BuildTree(int[] nodes) {
        if (nodes.length == 0 || nodes[0] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < nodes.length && !queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Left child
            if (i < nodes.length && nodes[i] != -1) {
                current.left = new TreeNode(nodes[i]);
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < nodes.length && nodes[i] != -1) {
                current.right = new TreeNode(nodes[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}