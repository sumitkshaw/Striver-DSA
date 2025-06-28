
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);
        System.out.println(result);
        sc.close();
    }
    public static Boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int [] count = new int[26];
        for(int i=0; i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int j=0; j<26; j++){
            if(count[j]!=0){
                return false;
            }
        }
        return true;
    }
}
