
import java.util.Scanner;


class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }
}

public class SearchInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nodes = new int[n];
        for(int i=0; i<n;i++){
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildTree(nodes);

    }
    public static TreeNode searchBST(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val) return root;
        
        if(val<root.val){
           return searchBST(root.left , val);
        }
        else{
            return searchBST(root.right , val);
        }
    
    }
    public static TreeNode buildTree(arr[]){

    }
}