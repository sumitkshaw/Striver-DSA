
import java.util.Scanner;

public class ExpectedNumber08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Length of the array  
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int found = missing(arr);
        System.out.println("The missing number is: " + found);
    }
    public static int missing(int[]arr){
        int n = arr.length;
        int exsum = (n * (n + 1)) / 2; // Expected sum of first n natural numbers
        int actsum = 0; // Actual sum of the array elements

        for(int i = 0; i < n; i++) {
            actsum += arr[i]; // Calculate the actual sum
        }
        return exsum - actsum; // The missing number is the difference between expected and actual sum
    }
}
