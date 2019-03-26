package com.example.demo.Graph;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

    @Autowired
    GraphService graphService;

    @PostMapping("/api/graph")
    public ResponseEntity<?> getGraph(){
        System.out.println("getGraph() kaldt");

        GraphResponseBody graphResponseBody = new GraphResponseBody();
        graphResponseBody.setVertices(graphService.vertices);
        graphResponseBody.setEdges(graphService.edges);
        graphResponseBody.setMsg("success");

        return ResponseEntity.ok(graphResponseBody);
    }
}
