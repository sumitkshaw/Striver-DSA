
import java.util.Scanner;

public class ZeroesToEnd06 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Length of the array
        int n = sc.nextInt();   
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Zeroes(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void Zeroes(int[] arr){
        int count = 0 ; // Count of non-zero elements
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = count; i<arr.length; i++){
            arr[i] =0;
            i++;
        }
    }
}
