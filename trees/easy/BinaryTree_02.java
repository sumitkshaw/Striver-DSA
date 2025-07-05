import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int x1){
        val = x;
        left = null;
        right = null;
    }
}

public class BinaryTree_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of nodes
        int n =sc.nextInt();

        int [] nodes = new int[n];

        for(int i=0; i<n; i++){
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildTree(nodes);
        printLevelOrder(root); 
        sc.close();
    }

        public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }
    }


    public static TreeNode buildTree(int[]nodes){
        if(nodes.length ==0 ){
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while(i<nodes.length){
            TreeNode current  = queue.poll();

            //Left Child
            if(i < nodes.length){
                current.left = new TreeNode(nodes[i++]);
                queue.offer(current.left);
            }
            //right Child
            if(i < nodes.length){
                current.right = new TreeNode(nodes[i++]);
                queue.offer(current.right);
            }
        }
        return root;
    }
}
