package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <Type> {

    public int size = 0;
    public HashMap< Vertex<Type>, List<Edge<Type>>> graphList;

    public Graph() {
        this.size=0;
        this.graphList = new HashMap<>();
    }

    public Graph(int size) {
        this.size = size;
        this.graphList = new HashMap<>();
    }

    public Vertex<Type> addNode(Type value) {

        Vertex<Type> node = new Vertex<>(value);
        graphList.put(node, new ArrayList<>());
        size++;
        return node;
    }

    public ArrayList<Vertex<Type>> getNodes() {
        ArrayList<Vertex<Type>> vertices = new ArrayList<>();
        for(Map.Entry< Vertex<Type>, List<Edge<Type>>> vertex : graphList.entrySet()) {
            Vertex<Type> node = vertex.getKey();
            vertices.add(node);
        }
        return  vertices;
    }


    public ArrayList<Edge<Type>> getNeighbors(Vertex<Type> value) {
        return (ArrayList) graphList.get(value);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (this.size == 0) ? true : false;
    }

    public String toString() {
        String Message="";
        for(Map.Entry< Vertex<Type>, List<Edge<Type>>> entry : graphList.entrySet()) {
            Message+=("Vertex: " + entry.getKey().value + "\n");
            for (Edge<Type> edge : entry.getValue()) {
                Message+=("Edge: " + edge.vertex.value + ", "  +  edge.weight + " -> \n");
            }
        }
        return Message;
    }

}