
import java.util.Scanner;


public class PrintN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing " + n + " times:");
        printS(n);
        sc.close();
    }
    public static void printS(int n){
        if (n == 0) {
            return;
        }
        System.out.println("GFG");
        printS(n - 1);
    }
}
