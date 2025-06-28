
import java.util.*;
public class ReserveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = Reverse(s);
        System.out.print(s);
        sc.close();
    }
    public static String Reverse(String s){

        if (s.trim().isEmpty()) return "";  // Handle empty or whitespace-only input

        String [] words = s.trim().split("\\s+");
        String out = "";

        for(int i = words.length-1; i>0; i--){
            out += words[i]+ " ";
        }
        return out+ words[0];

    }
}
