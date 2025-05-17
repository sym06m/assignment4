import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    private Map<Vertex<V>, Double> distances;
    private Map<Vertex<V>, Vertex<V>> previous;
    private PriorityQueue<Vertex<V>> priorityQueue;

    public DijkstraSearch() {
        this.distances = new HashMap<>();
        this.previous = new HashMap<>();
        this.priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(v -> distances.getOrDefault(v, Double.POSITIVE_INFINITY)));
    }

    @Override
    public void search(Vertex<V> start) {
        if (start == null) return;

      
        for (Vertex<V> vertex : start.getGraph().getVertices()) {
            distances.put(vertex, Double.POSITIVE_INFINITY);
            previous.put(vertex, null);
        }
        distances.put(start, 0.0);

        priorityQueue.offer(start);

        while (!priorityQueue.isEmpty()) {
            Vertex<V> current = priorityQueue.poll();

            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                double weight = current.getAdjacentVertices().get(neighbor);
                double distanceThroughCurrent = distances.get(current) + weight;

                if (distanceThroughCurrent < distances.get(neighbor)) {
                    distances.put(neighbor, distanceThroughCurrent);
                    previous.put(neighbor, current);
                    priorityQueue.offer(neighbor);
                }
            }
        }

       
        printShortestPaths(start);
    }

    private void printShortestPaths(Vertex<V> start) {
        for (Vertex<V> vertex : start.getGraph().getVertices()) {
            System.out.println("Shortest path to " + vertex + ": " + distances.get(vertex));
        }
    }
}
