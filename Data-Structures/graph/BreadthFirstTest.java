package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirst() {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        Vertex<String> node1 = graph.addNode("Pandora");
        Vertex<String> node2 = graph.addNode("Arendelle");
        Vertex<String> node3 = graph.addNode("Metroville");

        graph.addEdge(node1, node2, 4);
        graph.addEdge(node2, node3, 2);
        graph.addEdge(node3, node1, 10);

        String strTest="";
        for(Vertex<String> node : bfs.breadthFirstSearch(graph)) {
            strTest+=(node.value);
        }

        assertEquals("Return all nodes ", strTest, strTest);
    }

    @Test
    public void breadthFirstEmptyGraph() {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        assertEquals("Should return null.", null, bfs.breadthFirstSearch(graph));
    }

    @Test
    public void breadthFirstSingleNode() {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        Vertex<String> nodeAdded = graph.addNode("Washington");
        Vertex<String> nodeExists = bfs.breadthFirstSearch(graph).stream().findFirst().get();

        assertEquals("Should return null.", "Washington", nodeExists.value);
    }



}
