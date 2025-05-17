import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

      
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

      
        graph.addEdge("A", "B", 1.0);
        graph.addEdge("A", "C", 4.0);
        graph.addEdge("B", "C", 2.0);
        graph.addEdge("B", "D", 5.0);
        graph.addEdge("C", "D", 1.0);

        
        System.out.println("BFS Traversal:");
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        bfs.search(graph.getVertex("A"));

        
        System.out.println("\nDijkstra's Shortest Paths:");
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        dijkstra.search(graph.getVertex("A"));
    }
}
