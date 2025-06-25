import java.util.*;

public class FactorialsUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int n = sc.nextInt();

        List<Integer> result = getFactorials(n);

        // Output the factorials
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static List<Integer> getFactorials(int n) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;
        int i = 1;

        while (fact <= n) {
            list.add(fact);
            i++;
            fact *= i;
        }

        return list;
    }
}
