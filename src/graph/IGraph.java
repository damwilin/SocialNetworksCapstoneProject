package graph;

import java.util.ArrayList;

/**
 * Created by Damian on 11/20/2017.
 */
public interface IGraph {
    public void addVertex(int num);
    public void addEdge(int from, int to);
    public ArrayList<Integer> getNeighbors(int num);
    public ArrayList<Integer> getVertexNeighborsNotConnectedEachOther(int num);
    public ArrayList<Integer> findSmallestDominatingSet();

}
