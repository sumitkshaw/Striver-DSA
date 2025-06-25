import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call merge sort
        mergeSort(arr, 0, n - 1);

        // Output: sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Merge Sort function (recursive)
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;

        // Sort the left half
        mergeSort(arr, l, mid);
        // Sort the right half
        mergeSort(arr, mid + 1, r);
        // Merge the two sorted halves
        merge(arr, l, mid, r);
    }

    // Merge function to merge two sorted halves
    public static void merge(int[] arr, int l, int mid, int r) {
        // Temporary list to store the merged values
        ArrayList<Integer> temp = new ArrayList<>();

        int left = l;
        int right = mid + 1;

        // Merge elements from both halves in sorted order
        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        // Add remaining elements from left half
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Add remaining elements from right half
        while (right <= r) {
            temp.add(arr[right++]);
        }

        // Copy merged elements back into the original array
        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}
