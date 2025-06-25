
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input the integer
        boolean result = isPal(n); // Check if the number is a palindrome
        System.out.println(result); // Output the result
        
    }
    public static boolean isPal(int n){
        int d = n;
        int sum = 0;
        if(d < 0){
            return false;
        }
        while(d!=0){
            int rem = d % 10; // Get the last digit
            sum = sum * 10 + rem; // Build the reversed number
            d /= 10; // Remove the last digit
        }
        return sum == n; // Check if the reversed number is equal to the original number
    }
}
