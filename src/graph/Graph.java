package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Damian on 11/20/2017.
 */
public class Graph implements IGraph {
    private Map<Integer, ArrayList<Integer>> adjMap;

    public Graph() {
        adjMap = new HashMap<Integer, ArrayList<Integer>>();
    }

    @Override
    public void addVertex(int vertex) {
        if (!adjMap.containsKey(vertex)) {
            adjMap.put(vertex, new ArrayList<Integer>());
        } else throw new IllegalArgumentException("Graph already contains this node");
    }

    @Override
    public void addEdge(int from, int to) {
        adjMap.get(from).add(to);
    }

    @Override
    public ArrayList<Integer> getNeighbors(int num) {
        return adjMap.get(num);
    }

    @Override
    public ArrayList<Integer> getVertexNeighborsNotConnectedEachOther(int num) {
        //TODO Implement this method using BFS
        return null;
    }

    @Override
    public ArrayList<Integer> findSmallestDominatingSet() {
        //TODO Implement
        return null;
    }
}
