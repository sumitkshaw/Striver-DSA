import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Input the integer
        int result = evenlyDivides(n); // Count the digits that evenly divide n
        System.out.println(result); // Output the result
        sc.close();
    }
    public static int evenlyDivides(int n){
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10; // Get the last digit
            if(d != 0 && n % d == 0) { // Check if digit is not zero and divides n evenly
                count++;
            }
            temp /= 10; // Remove the last digit
        }
        return count;
    }   

}
