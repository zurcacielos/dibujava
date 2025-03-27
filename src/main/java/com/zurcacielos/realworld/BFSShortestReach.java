package com.zurcacielos.realworld;

// hacker rank bfs shortest reach
// given an undirected graph, find the shortest path from a node to all other nodes
public class BFSShortestReach {
    // Complete the bfs function below.
    static int[] bfs(int n, int m, int[][] edges, int s) {
        // create the graph
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            graph[edges[i][0] - 1][edges[i][1] - 1] = 1;
            graph[edges[i][1] - 1][edges[i][0] - 1] = 1;
        }
        // create the distances array
        int[] distances = new int[n];
        for (int i = 0; i < n; i++) {
            distances[i] = -1;
        }
        // create the queue
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        // add the starting node
        queue[tail++] = s - 1;
        distances[s - 1] = 0;
        // bfs
        while (head < tail) {
            int node = queue[head++];
            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && distances[i] == -1) {
                    distances[i] = distances[node] + 6;
                    queue[tail++] = i;
                }
            }
        }
        // remove the starting node
        int[] result = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i != s - 1) {
                result[j++] = distances[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int[][] edges = {{1, 2}, {1, 3}};
        int s = 1;
        int[] result = bfs(n, m, edges, s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
