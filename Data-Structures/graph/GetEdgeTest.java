package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetEdgeTest
{
    Graph<String> citiesGraph = new Graph<>();
    Graph<String> emptyGraph;
    GetEdge directFlight = new GetEdge();
    Vertex[] flightPath1;
    Vertex[] flightPath2;
    Vertex[] flightPath3;
    Vertex[] flightPath4;
    Vertex[] flightPath5;
    Vertex[] emptyFlightPath;

    @Before
    public void data() {
        Vertex<String> pandora = citiesGraph.addNode("Pandora");
        Vertex<String> narnia = citiesGraph.addNode("Narnia");
        Vertex<String> arendelle = citiesGraph.addNode("Arendelle");
        Vertex<String> monstropolis = citiesGraph.addNode("Monstropolis");
        Vertex<String> metroville = citiesGraph.addNode("Metroville");
        Vertex<String> naboo = citiesGraph.addNode("Naboo");

        citiesGraph.addEdge(pandora, arendelle, 150);
        citiesGraph.addEdge(pandora, metroville, 82);
        citiesGraph.addEdge(arendelle, metroville, 99);
        citiesGraph.addEdge(arendelle, monstropolis, 42);
        citiesGraph.addEdge(metroville, monstropolis, 105);
        citiesGraph.addEdge(metroville, narnia, 37);
        citiesGraph.addEdge(metroville, naboo, 26);
        citiesGraph.addEdge(monstropolis, naboo, 73);
        citiesGraph.addEdge(naboo, narnia, 250);

        flightPath1 = new Vertex[] { metroville, pandora};
        flightPath2 = new Vertex[] { arendelle, monstropolis, naboo };
        flightPath3 = new Vertex[] { naboo, pandora };
        flightPath4 = new Vertex[] { narnia, arendelle, naboo };
        flightPath5 = new Vertex[] { pandora, arendelle, monstropolis, naboo, narnia };
    }

    @Test
    public void directFlightTest() {
        assertEquals("return message with dollar amount.", "True, $82.0.", directFlight.directFlight(citiesGraph, flightPath1));
        assertEquals("return message with dollar amount.", "True, $115.0.", directFlight.directFlight(citiesGraph, flightPath2));
        assertEquals("return message with dollar amount.", "True, $515.0.", directFlight.directFlight(citiesGraph, flightPath5));
    }

    @Test
    public void unsuccessfulTest() {
        assertEquals("Unuccessful paths will return False.", "False, $0.0.", directFlight.directFlight(citiesGraph, flightPath3));
        assertEquals("Unuccessful paths will return False.", "False, $0.0.", directFlight.directFlight(citiesGraph, flightPath4));
    }

    @Test
    public void emptyTest() {
        assertEquals("Should return a null.", null, directFlight.directFlight(emptyGraph, flightPath3));
        assertEquals("Should return a null.", null, directFlight.directFlight(citiesGraph, emptyFlightPath));
    }
}