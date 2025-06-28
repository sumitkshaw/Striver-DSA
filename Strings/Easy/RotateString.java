
import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean result = IsRotate(s, t);
        System.out.println(result);
    }
    public static Boolean IsRotate(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return (s+s).contains(t);
    }
}
