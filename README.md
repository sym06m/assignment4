# Graph Algorithms Implementation

This project implements graph algorithms in Java, including Breadth-First Search (BFS) and Dijkstra's algorithm for edge-weighted graphs.

## Features
- **Vertex Class**: Represents a vertex in the graph with adjacent vertices stored as a map.
- **WeightedGraph Class**: Manages the collection of vertices and edges.
- **Breadth-First Search (BFS)**: Traverses the graph level by level.
- **Dijkstra's Algorithm**: Finds the shortest path from a source vertex to all other vertices.

## Structure
The project consists of the following files:
- `Vertex.java`: Represents a vertex in the graph.
- `WeightedGraph.java`: Manages the graph structure.
- `BreadthFirstSearch.java`: Implements BFS traversal.
- `DijkstraSearch.java`: Implements Dijkstra's algorithm.
- `Main.java`: Demonstrates usage of the implemented classes.
- `.gitignore`: Specifies files to ignore when uploading to GitHub.
- `README.md`: This file.

## Usage
To run the project:
1. Compile the code:
   ```bash
   javac Vertex.java WeightedGraph.java BreadthFirstSearch.java DijkstraSearch.java Main.java
