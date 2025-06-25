import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform bubble sort
        bubbleSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Perform n-1 passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if array is already sorted
            if (!swapped) break;
        }
    }
}