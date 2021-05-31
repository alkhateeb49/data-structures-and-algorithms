package graph;

import java.util.ArrayList;

public class GetEdge {
    public GetEdge() {}

    public String directFlight(Graph citiesGraph, Vertex[] citiesArray) {
        if (citiesGraph == null || citiesArray == null) {
            return null;
        }

        String Message = "";
        boolean theTripIsPossible = false;
        double costOfTheTrip = 0.0;
        ArrayList<Edge<String>> neighbors;

        for(int i = 0; i < citiesArray.length - 1; i++) {
            neighbors = citiesGraph.getNeighbors(citiesArray[i]);
            for (Edge<String> neighbor : neighbors) {
                if (neighbor.vertex.equals(citiesArray[i + 1])) {
                    costOfTheTrip += neighbor.weight;

                    if (neighbor.vertex.equals(citiesArray[citiesArray.length - 1])) {
                        theTripIsPossible = true;
                        break;
                    }
                }
            }
        }

        if (theTripIsPossible) {
            Message +="True, $"+costOfTheTrip+".";
        }
        else {
            Message+="False, $"+costOfTheTrip+".";
        }

        return Message;
    }
}