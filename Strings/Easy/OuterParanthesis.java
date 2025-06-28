
import java.util.Scanner;


public class OuterParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = remove(s);
        System.out.print(s);
    }
    public static String remove(String s){
        StringBuilder sb = new StringBuilder();
        int opened = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                if (opened>0){
                    sb.append(c);
                }
                opened++;
            }
            else if(c == ')'){
                opened --;
                if(opened > 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
