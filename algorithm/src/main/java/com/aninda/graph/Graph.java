package com.aninda.graph;

import java.util.Iterator;
import java.util.LinkedList;

public  class Graph {
    private int V;
    private LinkedList<Integer>[] adj;
    
    public Graph(int v) {
        V = v;
        adj = new LinkedList[this.V];
        for(int i = 0; i < this.V; i++) {
            this.adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        this.adj[src].add(dest);
    }

    public void BFS(int root) {
        boolean[] visited = new boolean[this.V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[root] = true;
        queue.add(root);

        while (queue.size() != 0) {
            int vertex = queue.poll();
            System.out.println(vertex + "");

            Iterator<Integer> i = adj[vertex].iterator();
            while(i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
