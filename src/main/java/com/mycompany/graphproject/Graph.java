/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;

/**
 *
 * @author pc home
 */
public class Graph {

    private int nodes;
    private HashMap<Integer, TreeSet<Integer>> graph;

    public Graph() {

    }

    public Graph(int n) {
        setNodes(n);
        graph = new HashMap<>();
        for (int i = 0; i < nodes; i++) {
            graph.put(i, new TreeSet<>());
        }
    }

    public void addEdge(int src, int dest) {
        if (src >= 0 && src < nodes) {
            graph.get(src).add(dest);
        }
    }
    public void printGraph()
    {
        for(int i = 0; i < nodes; i++)
        {
         System.out.println("Adjacency list of vertex " + i);
         Iterator it = graph.get(i).iterator();
         while(it.hasNext())
         {
             System.out.print(it.next()+" ");
         }
         System.out.println();
        }
    }

    /**
     * @return the nodes
     */
    public int getNodes() {
        return nodes;
    }

    /**
     * @param nodes the nodes to set
     */
    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

}
