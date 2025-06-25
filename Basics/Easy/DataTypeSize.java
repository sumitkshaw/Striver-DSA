import java.util.*;

public class DataTypeSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        System.out.println(getSize(type));
        sc.close();
    }

    public static int getSize(String type) {
        switch (type) {
            case "Character":
                return 2;
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            default:
                return -1; 
        }
    }
}
