import java.util.Scanner;

public class SearchRotated2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Read target value
        int target = sc.nextInt();

        // Find insert position
        boolean result = Search(nums, target);

        // Output result
        System.out.println(result);

        sc.close();
    }
    public static boolean  Search(int[]nums, int target){
        int left = 0;
        int right = nums.length -1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[left]==nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }
            if(nums[mid]==target){
                return true;
            }
            if(nums[left]<= nums[mid]){
                if(nums[left]<=target && nums[mid]>target){
                    right = mid-1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(nums[right]<=target && nums[mid]<target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
