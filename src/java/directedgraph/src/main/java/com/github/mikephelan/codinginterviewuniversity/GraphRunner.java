package com.github.mikephelan.codinginterviewuniversity;

/**
 * Runner class for a directed graph
 *
 */
public class GraphRunner {
    static Graph createGraph() {
	Graph graph = new Graph();
	graph.addVertex("Bob");
	graph.addVertex("Alice");
	graph.addVertex("Mark");
	graph.addVertex("Rob");
	graph.addVertex("Maria");
	graph.addEdge("Bob", "Alice");
	graph.addEdge("Bob", "Rob");
	graph.addEdge("Alice", "Maria");
	graph.addEdge("Rob", "Maria");
	return graph;
    }

    public static void main(String[] args) {
	System.out.println("Hello, GraphRunner!");
	Graph g = GraphRunner.createGraph();
	System.out.println("Begin Graph\n" + g.printGraph());
	System.out.println("End Graph");
    }
}
