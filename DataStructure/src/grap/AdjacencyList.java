package grap;

import java.util.LinkedList;

public class AdjacencyList {
	public int numVertices;
	public LinkedList<Integer> adjListArray[];

	@SuppressWarnings("unchecked")
	public AdjacencyList(int numVertices) {
		this.numVertices = numVertices;
		adjListArray = new LinkedList[numVertices];

		for (int i = 0; i < numVertices; i++)
			adjListArray[i] = new LinkedList<>();
	}
	public void addEdge(AdjacencyList grap, int src, int dest) {
		grap.adjListArray[src].add(dest);
		grap.adjListArray[dest].add(src);
	}

	public void printGraph(AdjacencyList graph) {
		for (int v = 0; v < graph.numVertices; v++) {
			System.out.println("Adjacency list of vertex " + v + ":");
			System.out.print("head");
			for (Integer printCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + printCrawl);
			}
			System.out.println("\n");
		}
	}

	/*public static void main(String args[]) {
		// create the graph given in above figure
		int V = 5;
		AdjacencyList graph = new AdjacencyList(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);

		printGraph(graph);
	}*/
}
