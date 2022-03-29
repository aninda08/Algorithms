package com.aninda.demo.graph;

import com.aninda.graph.Graph;
import com.aninda.graph.GraphCycle;

public class GraphDemoHandler {
    public static void graphCycleCheckDemo() {

        try {
            int V = 3, E = 3;
            GraphCycle graph = new GraphCycle(V, E);

            System.out.println("Inserting edges for graph and detecting cycle in it");
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(0, 2);

            if (graph.isCycle())
                System.out.println("Graph contains cycle");
            else
                System.out.println("Graph does not contain any cycle");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void graphTraversalBFSDemo() {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
}
