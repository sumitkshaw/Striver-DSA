import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public List<List<Integer>> printGraph(int V, int[][] edges) {
        // Initialize adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            // Add edge in both directions since it's undirected
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }
}