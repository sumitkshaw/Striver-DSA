
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: Data Type name
        int choice = sc.nextInt();

        double area = 0;

        switch (choice) {
            case 1: // Circle
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2: // Rectangle
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                area = length * width;
                break;
            case 3: // Triangle
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice");
                return; // Exit if invalid choice
        }
        // Output: Area of the shape
        System.out.printf("%.2f\n", area);
        sc.close();
    }
}
