import java.util.Scanner;

public class GetFloorCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read target value
        int target = sc.nextInt();

        // Calculate floor and ceil
        int floorValue = floor(arr, target);
        int ceilValue = ceil(arr, target);

        // Output results
        System.out.println(floorValue + " " + ceilValue);

        sc.close();
    }

    public static int floor(int[] a, int target) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] <= target) {
                floor = a[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return floor;
    }

    public static int ceil(int[] a, int target) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        int ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] >= target) {
                ceil = a[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ceil;
    }
}