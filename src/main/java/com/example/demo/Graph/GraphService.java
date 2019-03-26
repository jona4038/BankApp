package com.example.demo.Graph;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GraphService {

List<Vertex> vertices;
List<Edge> edges;

public GraphService(){
    initGraph();
}

private void initGraph(){
    List<Vertex> vertices = new ArrayList<>();
    System.out.println("iniGraph Called");
//    vertices.add(new Vertex(250, 70, "Bagsværd"));
//    vertices.add(new Vertex(376, 78, "Lyngby"));
//    vertices.add(new Vertex(440, 114, "Gentofte"));
//    vertices.add(new Vertex(461, 148, "Hellerup"));
//    vertices.add(new Vertex(480, 225, "Østerbro"));
//    vertices.add(new Vertex(440, 250, "Nørrebro"));
//    vertices.add(new Vertex(412, 391, "Sydhavnen"));
//    vertices.add(new Vertex(320, 416, "Hvidovre"));
//    vertices.add(new Vertex(100, 415, "Vallensbæk"));
    vertices.add(new Vertex(306, 328, "Rødovre")); // 0
    vertices.add(new Vertex(200, 340, "Glostrup"));// 1
    vertices.add(new Vertex(320, 275, "Vanløse"));// 2
    vertices.add(new Vertex(240, 170, "Herlev"));// 3
    vertices.add(new Vertex(136, 183, "Ballerup"));// 4
    vertices.add(new Vertex(62, 330, "Herstedvester"));// 5
    vertices.add(new Vertex(200, 340, "Glostrup"));// 6
    vertices.add(new Vertex(190, 210, "Skovlunde"));// 7

    this.vertices = vertices;

    // Create edges:
    this.edges = new ArrayList<>();
    edges.add(new Edge(vertices.get(0), vertices.get(1), 12));
    edges.add(new Edge(vertices.get(0), vertices.get(2), 8));
    edges.add(new Edge(vertices.get(2), vertices.get(7), 11));
    edges.add(new Edge(vertices.get(2), vertices.get(3), 9));
    edges.add(new Edge(vertices.get(3), vertices.get(4), 6));
    edges.add(new Edge(vertices.get(3), vertices.get(7), 10));
    edges.add(new Edge(vertices.get(4), vertices.get(7), 6));
    edges.add(new Edge(vertices.get(4), vertices.get(5), 13));
    edges.add(new Edge(vertices.get(1), vertices.get(5), 8));

    // Create Graph
    Graph<Vertex> graph = new Graph<>();
    for (Edge<Vertex> edge :edges) { // add all edges, and hence create the connections
        graph.addEdge(edge);
   }

   Dijkstra dijkstra = new Dijkstra();
   dijkstra.runDijkstra(vertices.get(5), vertices.get(2), graph);  // find vej fra Herstedvester til Vanløse

}
}
