import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}

public class Depth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nodes = new int [n];
        for(int i=0; i<n;i++){
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildTree(nodes);
        int result = maxDepth(root);
        System.out.println(result);
        sc.close();
    }
    public static TreeNode buildTree(int [] nodes){
        if(nodes.length==0){
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while(i<nodes.length){
            TreeNode current = queue.poll();

            //left child
            if(i<nodes.length){
                current.left = new TreeNode(nodes[i++]);
                queue.offer(current.left);
            }

            //right child
            if(i<nodes.length){
                current.right = new TreeNode(nodes[i++]);
                queue.offer(current.right);
            }
        }
        return root;
    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left)+1;
        int r = maxDepth(root.right)+1;

        return Math.max(l,r);
    }
}
