import java.util.Scanner;

public class LargestElement01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //length of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = LargestElement(arr);
        System.out.println("Largest Element: " + largest);
        sc.close();
    }
    public static int LargestElement(int[]arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE; 
        }
        int largest = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
