package com.github.mikephelan.codinginterviewuniversity.dijkstra;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Runner class for Dijkstra shortest path problem on a directed graph
 *
 */
public class DijkstraRunner {
    public static void main(String[] args) {
	System.out.println("Begin Shortest Path Problem");

	Node nodeA = new Node("A");
	Node nodeB = new Node("B");
	Node nodeC = new Node("C");
	Node nodeD = new Node("D");
	Node nodeE = new Node("E");
	Node nodeF = new Node("F");

	nodeA.addDestination(nodeB, 10);
	nodeA.addDestination(nodeC, 15);
	nodeB.addDestination(nodeD, 12);
	nodeB.addDestination(nodeF, 15);
	nodeC.addDestination(nodeE, 10);
	nodeD.addDestination(nodeE, 2);
	nodeD.addDestination(nodeF, 1);
	nodeF.addDestination(nodeE, 5);

	Graph graph = new Graph();
	Graph graphSoln = new Graph();
	graph.addNode(nodeA);
	graph.addNode(nodeB);
	graph.addNode(nodeC);
	graph.addNode(nodeD);
	graph.addNode(nodeE);
	graph.addNode(nodeF);
	graphSoln = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

	System.out.println("Shortest Path From node A to node F");
	Iterator<Node> iter = graphSoln.getNodes().iterator();
	while(iter.hasNext()){
	    if(iter.next().getName() == "F") {
		Node endNode = iter.next();
		LinkedList<Node> shortestPath = new LinkedList<>(endNode.getShortestPath());
		Iterator<Node> spIter = shortestPath.iterator();
		while(spIter.hasNext()) {
		    Node currNode = spIter.next();
		    System.out.println("Node: " + currNode.getName());
		}
	    }
	}
	System.out.println("End Shortest Path Problem");
    }
}
