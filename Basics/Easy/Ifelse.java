
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input two integers
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Output the decision
        System.out.println(decision(A, B));
        
    }
    public static String decision(int a, int b) {
        if (a > b) {
            return "A is greater than B";
        } else if (a < b) {
            return "B is greater than A";
        } else {
            return "A is equal to B";
        }
    }
}
