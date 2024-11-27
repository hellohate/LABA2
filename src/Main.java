import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(true); // true = орієнтований граф

        Vertex v1 = new Vertex("A", 1);
        Vertex v2 = new Vertex("B", 2);
        Vertex v3 = new Vertex("C", 3);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);

        graph.addEdge(v1, v2);
        graph.addEdge(v2, v3);
        graph.addEdge(v3, v1);

        System.out.println("Орієнтований граф:");
        graph.printGraph();

        Graph undirectedGraph = new Graph(false);
        undirectedGraph.addVertex(v1);
        undirectedGraph.addVertex(v2);
        undirectedGraph.addVertex(v3);

        undirectedGraph.addEdge(v1, v2);
        undirectedGraph.addEdge(v2, v3);

        System.out.println("\nНеорієнтований граф:");
        undirectedGraph.printGraph();
    }
}
