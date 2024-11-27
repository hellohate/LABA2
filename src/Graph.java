import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> adjacencyList;
    private final boolean isDirected;

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(Vertex vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex from, Vertex to) {
        if (!adjacencyList.containsKey(from) || !adjacencyList.containsKey(to)) {
            throw new IllegalArgumentException("Both vertices must exist in the graph.");
        }

        adjacencyList.get(from).add(to);
        if (!isDirected) {
            adjacencyList.get(to).add(from);
        }
    }

    public void printGraph() {
        for (Map.Entry<Vertex, List<Vertex>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Vertex v : entry.getValue()) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
