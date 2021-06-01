package graph;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Graph<String> graph = new Graph<>();
//        Vertex<String> node1 = graph.addNode("Washington");
//        Vertex<String> node2 = graph.addNode("Montana");
//        Vertex<String> node3 = graph.addNode("North Dakota");

//        graph.addUnDirectedEdge(node1, node2, 10);
//        graph.addUnDirectedEdge(node2, node3, 5);
//        graph.addUnDirectedEdge(node3, node1, 20);


//        System.out.println(graph.toString());

//
//        Vertex vertex = graph.getVertex("Washington");
//        List<Edge<String>> neighbors = graph.getNeighbors(vertex);
//
//        System.out.println("Neighbors: " + neighbors.get(0).vertex.value);
//        System.out.println("Neighbors: " + neighbors.get(1).vertex.value);
//
//
//        List<Vertex<String>> listOfVertices = graph.getNodes();
//        System.out.println("Vertex List: " + listOfVertices.get(0).value);
//        System.out.println("Vertex List: " + listOfVertices.get(1).value);
//        System.out.println("Vertex List: " + listOfVertices.get(2).value);
//
//        System.out.println("\nNothing broke.");





        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        Vertex<String> node1 = graph.addNode("Washington");
        Vertex<String> node2 = graph.addNode("Montana");
        Vertex<String> node3 = graph.addNode("North Dakota");

        graph.addEdge(node1, node2, 10);
        graph.addEdge(node2, node3, 5);
        graph.addEdge(node3, node1, 20);


        String testString = "";

        for(Vertex<String> node : bfs.breadthFirstSearch(graph))
        {
            testString+=(node.value + " \n");

        }

        System.out.println(testString);

    }
}
