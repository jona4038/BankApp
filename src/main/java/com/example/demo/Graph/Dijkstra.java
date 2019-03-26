package com.example.demo.Graph;

import java.util.*;

public class Dijkstra {

    private PriorityQueue<Vertex> queue = new PriorityQueue<>();
    private Map<Vertex, Vertex> backTrack = new HashMap<>();

    public void runDijkstra(Vertex v1, Vertex v2, Graph<Vertex> graph){

        Set<Vertex> markSet = new HashSet<>();
        queue.add(v1);
        v1.setLengthFromStart(0);

        while(!queue.isEmpty()){
            Vertex current = queue.poll();
            markSet.add(current); // den er markeret nu.

            for (Vertex neighbor : graph.adjencyList.get(current).keySet()){
                int initialWeight = graph.adjencyList.get(current).get(neighbor);
                if(current.getLengthFromStart() + initialWeight < neighbor.getLengthFromStart()){
                    neighbor.setLengthFromStart(current.getLengthFromStart() + initialWeight);
                    backTrack.put(neighbor,current);
                }
                if(!markSet.contains(neighbor)){
                    queue.add(neighbor);
                }
            }
        }
        //Udskriv korteste vej:
        Vertex v = v2; // start med destinationen
        String path = v.name;

        while(v != v1){
            path += backTrack.get(v).name + "\n";
            v = backTrack.get(v);
        }
        System.out.println(path);
    }
}
