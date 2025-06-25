import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: elements of array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call quick sort
        quickSort(arr, 0, n - 1);

        // Output: sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Function to sort an array using the Quick Sort algorithm
    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) return;

        int p = partition(arr, low, high);

        // Recursively sort the left and right subarrays around the pivot
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    // Function to partition the array and return the index of the pivot element
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // pivot
        int i = low - 1;

        // Move elements smaller than pivot to the left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to its correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}
