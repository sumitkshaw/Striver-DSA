import java.util.Scanner;

public class DuplicateSortRemove04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Length of the array  
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int length = Remove(arr);
        System.out.println(length);
    }
    public static int Remove(int[]arr){
        int count = 1;

        for(int i=1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
