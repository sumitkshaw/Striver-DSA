import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read image dimensions
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();
        
        // Initialize image matrix
        int[][] image = new int[m][n];
        
        // Read image pixel values
        System.out.println("Enter image pixel values row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = scanner.nextInt();
            }
        }
        
        // Read starting pixel and new color
        System.out.print("Enter starting row (sr): ");
        int sr = scanner.nextInt();
        System.out.print("Enter starting column (sc): ");
        int sc = scanner.nextInt();
        System.out.print("Enter new color: ");
        int color = scanner.nextInt();
        
        // Perform flood fill
        int[][] result = floodFill(image, sr, sc, color);
        
        // Print the result
        System.out.println("Flood filled image:");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        
        int originalColor = image[sr][sc];
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    
    private static void dfs(int[][] image, int row, int col, int originalColor, int newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || 
            image[row][col] != originalColor) {
            return;
        }
        
        image[row][col] = newColor;
        
        dfs(image, row + 1, col, originalColor, newColor); // down
        dfs(image, row - 1, col, originalColor, newColor); // up
        dfs(image, row, col + 1, originalColor, newColor); // right
        dfs(image, row, col - 1, originalColor, newColor); // left
    }
}