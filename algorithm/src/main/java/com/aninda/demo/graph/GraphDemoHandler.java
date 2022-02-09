package com.aninda.demo.graph;

import com.aninda.graph.Graph;

public class GraphDemoHandler {
    public static void graphCycleCheckDemo() {
        
        try {
            int V = 3, E = 3;
            Graph graph = new Graph(V, E);

            System.out.println("Inserting edges for graph and detecting cycle in it");
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(0, 2);

            if(graph.isCycle())
                System.out.println("Graph contains cycle");
            else
                System.out.println("Graph does not contain any cycle");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
