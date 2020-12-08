import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ConnectedComponents {
    private static int numberOfComponents(ArrayList<Integer>[] adjacencyList) {
        // YOUR CODE HERE
        boolean[] knownVertices = new boolean[adjacencyList.length];
        int components = 0;

        for (int vertex = 0; vertex < knownVertices.length; vertex++){
            if (adjacencyList[vertex] == null) continue;
            if (!knownVertices[vertex]) {
                components++;
                dfs(adjacencyList, knownVertices, vertex);
            }
        }

        return components; // <- change this line to return the correct result
    }

    // feel free to add a helper method to make your code cleaner & modular.
    private static void dfs(ArrayList<Integer>[] adjacencyList, boolean[] knownVertices, int vertex){
        knownVertices[vertex] = true;
        for (int adjVertex : adjacencyList[vertex]) {
            if (!knownVertices[adjVertex]) dfs(adjacencyList, knownVertices, adjVertex);
        }
    }


    public static void main(String[] args) {
        In in = new In("mediumG.txt");
        int vertices = in.readInt();
        int edges = in.readInt();
        ArrayList<Integer>[] adjacencyList = (ArrayList<Integer>[])new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges; i++) {
            int x, y;
            x = in.readInt()+1; // +1 for mediumG.txt
            y = in.readInt()+1; // +1 for mediumG.txt
            adjacencyList[x-1].add(y-1);
            adjacencyList[y-1].add(x-1);
        }
        System.out.println(numberOfComponents(adjacencyList));
    }
}

