package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class graphTest {
    @Test
    public void testAddGraph() {
        Graph<String> testGraph = new Graph<>();
        assertEquals("Successfully adding to the graph.", "Test", testGraph.addNode("Test").value);
    }

    @Test
    public void testAddEdge() {
        Graph<String> testGraph = new Graph<>();
        testGraph.addNode("Test");
        assertEquals("Successfully adding edge.", "Vertex: Test\n", testGraph.toString());
    }

    @Test
    public void retrievedCollectionOfNodes() {
        Graph<String> testGraph = new Graph<>();
        testGraph.addNode("Test1");
        testGraph.addNode("Test2");
        assertEquals("Successfully retrieved collection of nodes.", testGraph.toString(),testGraph.toString());
    }

}
