import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        System.out.println("Sum of cubes from 1 to " + n + ":");
        int result = sum(n);
        System.out.println(result);
        sc.close();
    }

    public static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return (n * n * n) + sum(n - 1);
    }
}
