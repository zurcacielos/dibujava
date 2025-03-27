package com.zurcacielos.realworld;

import java.util.List;

// hacker rank bfs shortest reach
class ResultBfs {

    public static int[] bfs(int n, int m, List<List<Integer>> edges, int s) {
        // create the graph
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            graph[edges.get(i).get(0) - 1][edges.get(i).get(1) - 1] = 1;
            graph[edges.get(i).get(1) - 1][edges.get(i).get(0) - 1] = 1;
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


    public static class BfsShortestReach2 {
        public static void main(String[] args) {
            int n = 4;
            int m = 2;
            List<List<Integer>> edges = List.of(List.of(1, 2), List.of(1, 3));
            int s = 1;
            int[] result = ResultBfs.bfs(n, m, edges, s);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
