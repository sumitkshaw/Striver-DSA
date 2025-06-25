
import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing from " + n + " to 1:");
        printNto1(n);
        sc.close();
    }

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }
}
