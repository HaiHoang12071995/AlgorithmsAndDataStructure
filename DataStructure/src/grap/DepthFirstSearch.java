package grap;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
	private int V;
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
 
    @SuppressWarnings("unchecked")
	DepthFirstSearch(int vertices)
    {
        V = vertices;
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];
        
        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<>();
    }
 
    void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
    }
 
    void DFS(int vertex)
    {
        visited[vertex] = true;
        System.out.print(vertex + " ");
 
        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext())
        {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }
 
	public static void main(String args[])
    {
       DepthFirstSearch g = new DepthFirstSearch(4);
 
       g.addEdge(0, 1); 
       g.addEdge(0, 2); 
       g.addEdge(1, 2); 
       g.addEdge(2, 0); 
       g.addEdge(2, 3); 
       g.addEdge(3, 3); 
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFS(2);
    }
}
