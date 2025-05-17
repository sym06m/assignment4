import java.util.*;

public class BreadthFirstSearch<V> implements Search<V> {
    private Queue<Vertex<V>> queue;
    private Set<Vertex<V>> visited;

    public BreadthFirstSearch() {
        this.queue = new LinkedList<>();
        this.visited = new HashSet<>();
    }

    @Override
    public void search(Vertex<V> start) {
        if (start == null) return;

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            System.out.println("Visited: " + current);

            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
