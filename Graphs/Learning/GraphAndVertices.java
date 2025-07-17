import java.util.Scanner;

public class GraphAndVertices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Number of possible undirected graphs: " + countGraphs(n));
        
        scanner.close();
    }
    
    public static long countGraphs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Calculate the maximum number of edges in an undirected graph with n vertices
        long maxEdges = (long) n * (n - 1) / 2;
        
        // The number of possible graphs is 2^maxEdges
        return (long) Math.pow(2, maxEdges);
    }
}