import java.util.*;

public class IntroToTrees_01 {
    public static int countNodes(int i) {
        return (int) Math.pow(2, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(countNodes(i));
        sc.close();
    }
}