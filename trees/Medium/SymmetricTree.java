
import java.util.*;

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
public class SymmetricTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nodes = new int [n];
        for(int i=0; i<n;i++){
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildTree(nodes);
        boolean result = isSymmetric(root);
        System.out.println(result);
        
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
    public static boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        return compare( root.left, root.right);

    }
    public static boolean compare(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && compare(left.left , right.right) &&
        compare(left.right, right.left);
    }
}