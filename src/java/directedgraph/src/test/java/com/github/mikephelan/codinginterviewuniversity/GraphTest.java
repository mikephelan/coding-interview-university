package com.github.mikephelan.codinginterviewuniversity;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple graph.
 */
public class GraphTest
{
    /**
     * Test adjacent vertices for an edge.
     */
    @Test
    public void graphComposition()
    {
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
        assertEquals(graph.getAdjVertices("Bob").toString(), "[Alice, Rob]");
    }
}
