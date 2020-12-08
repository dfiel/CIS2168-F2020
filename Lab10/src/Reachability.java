import java.util.*;

public class Reachability {
    private static int reach(ArrayList<Integer>[] adjacencyList, int startVertex, int endVertex) {
        boolean[] marked = new boolean[adjacencyList.length];
        boolean found = dfs(adjacencyList, startVertex, endVertex, marked);

        return found ? 1 : 0;  // return 1 if found, otherwise 0
    }

    // Hint: review depth-first search (dfs). It may be 'cleaner' to write a
    // separate helper method (dfs) and call it from your code in reach().
    // Alternatively, you can keep all your logic in reach(), if you wish.

    private static boolean dfs(ArrayList<Integer>[] adjacencyList, int startVertex, int targetVertex, boolean[] marked){
        marked[startVertex] = true;
        boolean found = false;
        for (int adjVertex : adjacencyList[startVertex]){
            if (adjVertex == targetVertex) return true;
            if (!marked[adjVertex]) found = dfs(adjacencyList, adjVertex, targetVertex, marked);
            if (found) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        In in = new In("G1-1.txt");
        int vertices = in.readInt();  // number of vertices
        int edges = in.readInt();  // number of edges

        // for each vertex, allocate space for its adjacency list
        ArrayList<Integer>[] adjacencyList = (ArrayList<Integer>[])new ArrayList[vertices+1];
        for (int i = 0; i < vertices+1; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }

        // read the next m lines of input and build an
        // adjacency list representation of the graph
        for (int i = 0; i < edges; i++) {
            int x, y;
            x = in.readInt();
            y = in.readInt();
            adjacencyList[x].add(y);
            adjacencyList[y].add(x);
        }
        System.out.println(Arrays.toString(adjacencyList) + "\n");

        // read the last line of the input file.
        // x = the start vertex; y = the end vertex
        int x = in.readInt();
        int y = in.readInt();
        // is y reachable from x
        System.out.println(reach(adjacencyList, x, y));
    }
}
