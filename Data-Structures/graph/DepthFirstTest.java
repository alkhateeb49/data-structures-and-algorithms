package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthFirstTest {



    @Test
    public void depthFirstEmptyGraph() {
        Graph<String> graph = new Graph<>();
        Vertex a = null;
        assertEquals("Should return null.", null, graph.depthFirst(a));
    }

    @Test
    public void depthFirstSingleNode() {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        Vertex<String> nodeAdded = graph.addNode("Washington");
        Vertex<String> nodeExists = bfs.breadthFirstSearch(graph).stream().findFirst().get();

        assertEquals("Should return null.", "Washington", nodeExists.value);
    }
    
    @Test
    public void testDepthFirst() {
        Graph<String> graph = new Graph<>();

        Vertex<String> a = graph.addNode("A");
        Vertex<String> b = graph.addNode("B");
        Vertex<String> c = graph.addNode("C");
        Vertex<String> d = graph.addNode("D");
        Vertex<String> e = graph.addNode("E");
        Vertex<String> f = graph.addNode("F");
        Vertex<String> g = graph.addNode("G");
        Vertex<String> h = graph.addNode("H");

        graph.addEdge(a, b, 0);
        graph.addEdge(a, d, 0);
        graph.addEdge(b, d, 0);
        graph.addEdge(b, c, 0);
        graph.addEdge(c, g, 0);
        graph.addEdge(d, e, 0);
        graph.addEdge(d, h, 0);
        graph.addEdge(d, f, 0);

        assertEquals("Returns all data from graph.", "[A, B, D, E, H, F, C, G]", graph.depthFirst(a).toString());
    }
}
