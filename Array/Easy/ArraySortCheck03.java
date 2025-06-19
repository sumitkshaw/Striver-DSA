import java.util.*;

public class ArraySortCheck03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = check(arr);

        System.out.println(isSorted);
        sc.close();
    }
    public static boolean check(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
