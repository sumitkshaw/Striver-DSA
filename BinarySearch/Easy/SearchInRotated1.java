import java.util.Scanner;

public class SearchInRotated1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read rotated sorted array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Read target value
        int target = sc.nextInt();

        // Search for target
        int result = Search(nums, target);

        // Output result
        System.out.println(result);

        sc.close();
    }

    public static int Search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}