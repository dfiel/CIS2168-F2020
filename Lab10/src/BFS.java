import java.util.*;

public class BFS {

    private static int distance(ArrayList<Integer>[] adjacencyList, int start, int finish) {
        boolean[] marked = new boolean[adjacencyList.length];
        int[] distTo = new int[adjacencyList.length];
        Arrays.fill(distTo, -1);
        distTo[start] = 0;

        // YOUR CODE HERE
        bfs(adjacencyList, start, marked, distTo);

        return distTo[finish];
    }

    // Feel free to add a helper method, like the following, to make your code cleaner & modular.
    private static void bfs(ArrayList<Integer>[] adjacencyList, int start, boolean[] marked, int[] distTo) {
        Queue<Integer> queue = new LinkedList<Integer>();
        marked[start] = true;
        queue.add(start);
        while (!queue.isEmpty()){
            int vertex = queue.remove();
            for (int adjVertex : adjacencyList[vertex]){
                if (!marked[adjVertex]){
                    queue.add(adjVertex);
                    marked[adjVertex] = true;
                    distTo[adjVertex] = distTo[vertex]+1;
                }
            }
        }
    }


    public static void main(String[] args) {
        In in = new In("G3-2.txt");
        int vertices = in.readInt();
        int edges = in.readInt();
        ArrayList<Integer>[] adjacencyList = (ArrayList<Integer>[])new ArrayList[vertices+1];
        for (int i = 0; i < vertices+1; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edges; i++) {
            int x, y;
            x = in.readInt();
            y = in.readInt();
            adjacencyList[x].add(y);
            adjacencyList[y].add(x);
        }

        int x = in.readInt();
        int y = in.readInt();

        System.out.println(distance(adjacencyList, x, y));
    }
}
