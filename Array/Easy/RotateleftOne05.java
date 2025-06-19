import java.util.Scanner;

public class RotateleftOne05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // Number of rotations
        
        int n = sc.nextInt(); // Length of the array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr,0, arr.length-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k,  arr.length-1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
