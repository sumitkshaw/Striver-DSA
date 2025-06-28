
import java.util.Scanner;

public class LargestOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = Largest(s);
        System.out.println(s);
        sc.close();
        
    }
    public static String Largest(String s){
        for(int i = s.length()-1;i>=0;i--){
            if (Character.getNumericValue(s.charAt(i)) % 2 == 1){
                return s.substring(0, i+1);
            }
        }
        return "";
    }
}
