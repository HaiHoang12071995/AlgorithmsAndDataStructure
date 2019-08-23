package grap;

public class AdjacencyMatrix {
	private boolean Matrix[][];
	private int numVertices;

	public AdjacencyMatrix(int numVertices) {
		this.numVertices = numVertices;
		Matrix = new boolean[numVertices][numVertices];
	}

	public void adjacencyMatrix(boolean Matrix[][], int row, int col) {
		addEdge(row, col);
		removeEdge(row, col);
		toString();
	}

	public void addEdge(int row, int col) {
		Matrix[row][col] = true;
		Matrix[col][row] = true;
	}

	public void removeEdge(int row, int col) {
		Matrix[row][col] = false;
		Matrix[col][row] = false;
	}

	public boolean isEdge(int row, int col) {
		return Matrix[row][col];
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int row = 0; row < numVertices; row++) {
			s.append(row + ": ");
			for (boolean col : Matrix[row]) {
				s.append((col ? 1 : 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public static void main(String args[]) {

		AdjacencyMatrix g = new AdjacencyMatrix(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);

		System.out.println(g.toString());
	}
}
