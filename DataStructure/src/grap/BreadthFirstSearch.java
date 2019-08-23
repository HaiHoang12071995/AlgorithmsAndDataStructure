package grap;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists

	// Constructor
	@SuppressWarnings("unchecked")
	public BreadthFirstSearch(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public void breadthFirstSearch(int source) {

		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[source] = true;

		queue.add(source);

		while (queue.size() != 0) {
			source = queue.poll();
			System.out.print(source + " ");
			Iterator<Integer> i = adj[source].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}

	}

	public static void main(String args[]) {
		BreadthFirstSearch g = new BreadthFirstSearch(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.breadthFirstSearch(2);
	}
}
