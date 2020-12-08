import java.util.*;

public class Dijkstra {
    private static int distance(DirectedGraph graph, int start, int finish) {
        return graph.distanceBetween(start, finish);
    }

    public static void main(String[] args) {
        In in = new In("G4-3.txt");
        int vertices = in.readInt();
        int edges = in.readInt();
        DirectedGraph graph  = new DirectedGraph(vertices);
        for (int i = 0; i < edges; i++) {
            int x, y, w;
            x = in.readInt()-1;
            y = in.readInt()-1;
            w = in.readInt();
            graph.addEdge(x, y, w);
        }
        int x = in.readInt()-1;
        int y = in.readInt()-1;
        System.out.println(distance(graph, x, y));
        System.out.println(graph);
    }
}

class DirectedGraph{
    static class Edge implements Comparable<Edge>{
        public int node;
        public int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }

        @Override
        public String toString(){
            return "(" + this.node + ", " + this.weight + ")";
        }
    }

    final private List<List<Edge>> edgeList;
    final private int vertices;
    final private int[] distance;
    final private PriorityQueue<Edge> pq;
    final private Set<Integer> marked;

    public DirectedGraph(int vertices){
        edgeList = new ArrayList<>();
        this.vertices = vertices;
        distance = new int[vertices];
        pq = new PriorityQueue<>(vertices);
        marked = new HashSet<>();
        for (int i = 0; i < vertices; i++){
            edgeList.add(i, new ArrayList<>());
        }
    }

    public void addEdge(int start, int end, int weight){
        edgeList.get(start).add(new Edge(end, weight));
    }

    @Override
    public String toString(){
        return edgeList.toString();
    }

    public int[] dijkstra(int start){
        pq.clear();
        marked.clear();
        Arrays.fill(distance, Integer.MAX_VALUE);
        pq.add(new Edge(start, 0));
        distance[start] = 0;

        while(marked.size() != vertices){
            try {
                int min = pq.remove().node;
                marked.add(min);
                processNeighbors(min);
            }
            catch (NoSuchElementException e) {
                break;
            }
        }

        return distance;
    }

    private void processNeighbors(int node){
        for(Edge edge : edgeList.get(node)){
            int edgeNode = edge.node;
            if (!marked.contains(edgeNode)){
                int edgeWeight = distance[node] + edge.weight;
                if(edgeWeight < distance[edgeNode]) distance[edgeNode] = edgeWeight;
                pq.add(new Edge(edgeNode, distance[edgeNode]));
            }
        }

    }

    public int distanceBetween(int start, int end){
        dijkstra(start);
        return distance[end] == Integer.MAX_VALUE ? -1 : distance[end];
    }
}