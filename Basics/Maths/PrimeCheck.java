import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        int n = sc.nextInt();

        // Check and output whether it's prime
        System.out.println(isPrime(n));

        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
