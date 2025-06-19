
import java.util.Scanner;

public class ConsecutiveOnes09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Length of the array  
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = maxConsecutives(arr);
        System.out.println("Maximum number of consecutive 1's: " + maxCount);
    }
    public static int maxConsecutives(int[] arr){
        int count = 0;
        int maxcount = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return maxcount;
    }
}
