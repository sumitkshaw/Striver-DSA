import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int result = Rotation(arr);
        System.out.println(result);
        sc.close();
    }

    public static int Rotation(List<Integer> arr) {
        int count = 0;
        int l = 0;
        int r = arr.size() - 1;

        while (l < r) {
            if (arr.get(l) > arr.get(r)) {
                count++;
                l++;
            } else {
                r--;
            }
        }
        return count;
    }
}