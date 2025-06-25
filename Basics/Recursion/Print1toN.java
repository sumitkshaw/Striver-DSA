public class Print1toN {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing from 1 to " + n + ":");
        print1toN(n);
        sc.close();
    }

    public static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.println(n);
    }
}
