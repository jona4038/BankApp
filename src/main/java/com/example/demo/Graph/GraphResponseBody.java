package com.example.demo.Graph;

import java.util.List;

public class GraphResponseBody {
// This class has no annotations. But since it's fields are String based, they can be
    // accessed on the client side, using javascript object notation (JSON)
    private String msg;
    private List<Vertex> vertices;
    private List<Edge> edges;
    private List<Edge> shortestPath;

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public String getMsg() { // this will respond to a Object.msg call on the client-side.
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }
}
