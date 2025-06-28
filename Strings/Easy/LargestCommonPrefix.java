import java.util.*;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()
        
        // Read the strings into an array
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }
        
        // Call the Count method and print the result
        String result = Count(strs);
        System.out.println("Largest Common Prefix: " + result);
        
        sc.close();
    }

    public static String Count(String[] s) {
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length - 1];
        int idx = 0;

        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}