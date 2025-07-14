
import java.util.Scanner;

public class IntroToBst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = isBST(arr);
        System.out.println(result);
    }
    public static boolean isBST(int[]arr){
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
