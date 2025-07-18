import java.util.ArrayList;
import java.util.Stack;

public class Dfs {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        if (adj == null || adj.size() == 0) {
            return result;
        }

        int V = adj.size();
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Start DFS from vertex 0
        stack.push(0);
        visited[0] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            result.add(current);

            // Push neighbors in reverse order to maintain correct traversal order
            for (int i = adj.get(current).size() - 1; i >= 0; i--) {
                int neighbor = adj.get(current).get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return result;
    }
}