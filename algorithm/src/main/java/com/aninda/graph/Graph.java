package com.aninda.graph;

public class Graph {
    int V, E;
    
    Edge edge[];
    int edgeCount = 0;

    class Edge {
        int src, dest;
    }

    public Graph(int v, int e) {
        this.V = v;
        this.E = e;
        this.edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }
    
    public void addEdge(int src, int dest) throws Exception {
        if(this.edgeCount > this.E)
            throw new Exception("Edge count is full");

        this.edge[edgeCount].src = src;
        this.edge[edgeCount].dest = dest;
        this.edgeCount++;
    }

    public int find(int parent[], int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    public void union(int parent[], int x, int y) {
        parent[x] = y;
    }

    public boolean isCycle() throws Exception {
        if (edgeCount < this.E - 1) {
            throw new Exception("Edge count is not full");
        }
        int[] parent = new int[this.V];

        for (int i = 0; i < this.V; i++) {
            parent[i] = -1;
        }

        for (int i = 0; i < this.E; i++) {
            int x = find(parent, this.edge[i].src);
            int y = find(parent, this.edge[i].dest);

            if (x == y)
                return true;

            union(parent, x, y);
        }

        return false;
    }
    
    
}
