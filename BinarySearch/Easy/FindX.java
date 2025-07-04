
import java.util.Scanner;


public class FindX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = search(arr,target);
        System.out.println(result);
        sc.close();
    }
    public static int search(int [] nums, int target){
        int i=0;
        int j= nums.length-1;

        while(i <= j){
            int mid = i + (j-i) / 2;

            if (nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                i = mid +1;
            }
            else{
                j = mid-1;
            }
        }
        return -1;
    }
}
