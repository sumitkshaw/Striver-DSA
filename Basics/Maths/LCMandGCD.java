import java.util.*;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = lcmAndGcd(a, b);

        // Output: LCM and GCD
        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);

        sc.close();
    }

    public static int[] lcmAndGcd(int a, int b) {
        // GCD
        int n = Math.min(a, b);
        int max = 1;
        for (int x = 2; x <= n; x++) {
            if (a % x == 0 && b % x == 0) {
                max = x;
            }
        }

        // LCM
        int lcm = (a * b) / max;
        return new int[]{lcm, max};
    }
}
