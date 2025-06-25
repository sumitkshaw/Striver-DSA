
import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = reverse(n); // Reverse the integer
        System.out.println(result); // Output the reversed integer
    }
    public static int reverse(int n){
        long  sum = 0;
        int d = n;

        while(d !=0){
            int rem = d%10;
            sum = sum * 10 + rem; // Build the reversed number
            d /= 10; // Remove the last digit
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
                return 0;
        }
        return (int) sum;
    }
}
