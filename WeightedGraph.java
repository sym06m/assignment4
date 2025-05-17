import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<V, Vertex<V>> vertices;

    public WeightedGraph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(V data) {
        vertices.put(data, new Vertex<>(data));
    }

    public void addEdge(V sourceData, V destinationData, double weight) {
        Vertex<V> source = vertices.get(sourceData);
        Vertex<V> destination = vertices.get(destinationData);

        if (source == null) {
            source = new Vertex<>(sourceData);
            vertices.put(sourceData, source);
        }
        if (destination == null) {
            destination = new Vertex<>(destinationData);
            vertices.put(destinationData, destination);
        }

        source.addAdjacentVertex(destination, weight);
         }

    public Vertex<V> getVertex(V data) {
        return vertices.get(data);
    }

    public Set<V> getVertices() {
        return vertices.keySet();
    }
}
