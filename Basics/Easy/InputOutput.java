import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input two integers
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = multiply(A, B);
        // Output the result
        System.out.println(result);
        sc.close();
    }
    public static int multiply(int a, int b){
        return a * b;
    }
}
