package com.example.demo.Graph;

import java.util.HashMap;
import java.util.Map;

public class Graph<T> {

    Map<T, Map<T,Integer>> adjencyList = new HashMap<>();

    public void addEdge(Edge<T> edge){
        addEdge(edge.v1, edge.v2, edge.weight);
    }

    private void addEdge(T v1, T v2, int weight){
        if(!adjencyList.containsKey(v1)){
            adjencyList.put(v1, new HashMap<>());
        }
        adjencyList.get(v1).put(v2, weight);

        // Nedenfor bliver grafen "undirected"
        if(!adjencyList.containsKey(v2)){
            adjencyList.put(v2, new HashMap<>());
        }
        adjencyList.get(v2).put(v1,weight);
    }

}
