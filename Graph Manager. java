import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphManager {

    private Map<Integer, List<Integer>> graph;

    public GraphManager() {

        graph = new HashMap<>();
    }

    public void addVertex(int vertex) {

        if (!graph.containsKey(vertex)) {

            graph.put(vertex, new ArrayList<>());

            System.out.println("Vertex added successfully.");

        } else {

            System.out.println("Vertex already exists.");
        }
    }

    public void addEdge(int vertex1, int vertex2) {

        if (!graph.containsKey(vertex1)) {

            addVertex(vertex1);
        }

        if (!graph.containsKey(vertex2)) {

            addVertex(vertex2);
        }

        graph.get(vertex1).add(vertex2);

        graph.get(vertex2).add(vertex1);

        System.out.println("Edge added successfully.");
    }

    public void displayGraph() {

        if (graph.isEmpty()) {

            System.out.println("Graph is empty.");
            return;
        }

        System.out.println("Graph:");

        for (int vertex : graph.keySet()) {

            System.out.print(vertex + " -> ");

            for (int connectedVertex : graph.get(vertex)) {

                System.out.print(connectedVertex + " ");
            }

            System.out.println();
        }
    }

    public void bfs(int startVertex) {

        if (!graph.containsKey(startVertex)) {

            System.out.println("Starting vertex does not exist.");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();

        Set<Integer> visited = new HashSet<>();

        queue.add(startVertex);

        visited.add(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int currentVertex = queue.poll();

            System.out.print(currentVertex + " ");

            for (int neighbour : graph.get(currentVertex)) {

                if (!visited.contains(neighbour)) {

                    visited.add(neighbour);

                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    public void dfs(int startVertex) {

        if (!graph.containsKey(startVertex)) {

            System.out.println("Starting vertex does not exist.");
            return;
        }

        Set<Integer> visited = new HashSet<>();

        System.out.print("DFS Traversal: ");

        dfsRecursive(startVertex, visited);

        System.out.println();
    }

    private void dfsRecursive(
            int vertex,
            Set<Integer> visited) {

        visited.add(vertex);

        System.out.print(vertex + " ");

        for (int neighbour : graph.get(vertex)) {

            if (!visited.contains(neighbour)) {

                dfsRecursive(neighbour, visited);
            }
        }
    }
}
