import java.util.*;

class DijkstraExample {
    static class Edge {
        int dest, weight;
        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int src) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int d = current[1];

            if (d > dist[u]) continue;

            for (Edge edge : graph.get(u)) {
                int v = edge.dest;
                int weight = edge.weight;
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        System.out.println("Shortest distances from source " + src + ": " + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Edge>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Add edges
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(3, 5));
        graph.get(1).add(new Edge(2, 1));
        graph.get(3).add(new Edge(1, 3));
        graph.get(3).add(new Edge(2, 9));
        graph.get(3).add(new Edge(4, 2));
        graph.get(4).add(new Edge(2, 4));

        // Run Dijkstra algorithm
        dijkstra(graph, 0);
    }
}
