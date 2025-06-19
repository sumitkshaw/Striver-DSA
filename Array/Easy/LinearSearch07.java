
import java.util.Scanner;

public class LinearSearch07 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        //Target element to search
        int target = sc.nextInt();
        //Length of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean found = Search(arr, target);
        if(found){
            System.out.println("Element found: "+target);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
    public static boolean Search(int[]arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
