package drumuripkg;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	// Number of vertices
	private int v;
	// Adjacency list
	private ArrayList<Integer>[] adjList;

	private Graph(int vertices) {

		this.v = vertices;

		initAdjList();
	}

	// utility method to initialise adjacency list
	@SuppressWarnings("unchecked")
	private void initAdjList() {
		adjList = new ArrayList[v];

		for (int i = 0; i < v; i++) {
			adjList[i] = new ArrayList<>();
		}
	}

	// add edge from u to v
	private void addEdge(int u, int v) {
		adjList[u].add(v);
	}

	// Prints all paths from 's' to 'd'
	private void printAllPaths(int s, int d) {
		boolean[] isVisited = new boolean[v];
		ArrayList<Integer> pathList = new ArrayList<>();

		pathList.add(s);

		// Call recursive utility
		printAllPathsUtil(s, d, isVisited, pathList);
	}

	// A recursive function to print
	// all paths from 'u' to 'd'.
	// isVisited[] keeps track of
	// vertices in current path.
	// localPathList<> stores actual
	// vertices in the current path
	private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {

		// Mark the current node
		isVisited[u] = true;

		if (u.equals(d)) {
			System.out.println(localPathList);
			// if match found then no need to traverse more till depth
			isVisited[u] = false;
			return;
		}
		// Recur for all the vertices
		// adjacent to current vertex
		for (Integer i : adjList[u]) {
			if (!isVisited[i]) {
				// store current node
				// in path[]
				localPathList.add(i);
				printAllPathsUtil(i, d, isVisited, localPathList);

				// remove current node
				// in path[]
				localPathList.remove(i);
			}
		}
		// Mark the current node
		isVisited[u] = false;
	}

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		g.addEdge(1, 3);

		int s = 2;

		int d = 3;

		System.out.println("Following are all different paths from " + s + " to " + d);
		g.printAllPaths(s, d);

	}
}
