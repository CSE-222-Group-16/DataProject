package org.cse222.DataStructures;

import org.cse222.Block;

import java.util.*;

/** A ListGraph is an extension of the AbstractGraph abstract class
 *   that uses an array of lists to represent the edges.
 *   @author Koffman and Wolfgang
 */

public class ListGraph extends AbstractGraph {

    // Data Field
    /** An array of Lists to contain the edges that
     originate with each vertex. */
    private List < Edge<Block> > [] edges;

    /** Construct a graph with the specified number of
     vertices and directionality.
     @param numV The number of vertices
     @param directed The directionality flag
     */
    public ListGraph(int numV, boolean directed) {
        super(numV, directed);
        edges = new List[numV];
        for (int i = 0; i < numV; i++) {
            edges[i] = new LinkedList <> ();
        }
    }
    
    public void remove(Block source){
        edges[source.getPersonalData().getID()].remove(source);
    }
    /** Determine whether an edge exists.
     @return true if there is an edge from source to dest
      * @param source The source vertex
     * @param dest The destination vertex
     */
    public boolean isEdge(Block source, Block dest) {
        return edges[source.getPersonalData().getID()].contains(new Edge<>(source, dest));
    }

    /** Insert a new edge into the graph.
     * @param edge The new edge
     */
    public void insert(Edge<Block> edge) {
        edges[edge.getSource().getPersonalData().getID()].add(edge);
        if (!isDirected()) {
            edges[edge.getDest().getPersonalData().getID()].add(new Edge<>(edge.getDest(),
                    edge.getSource(),
                    edge.getWeight()));
        }
    }

    public Iterator < Edge <Block>> edgeIterator(Block source) {
        return edges[source.getPersonalData().getID()].iterator();
    }

    /** Get the edge between two vertices. If an
     edge does not exist, an Edge with a weight
     of Double.POSITIVE_INFINITY is returned.
     @return the edge between these two vertices
      * @param source The source
     * @param dest The destination
     */
    public Edge<Block> getEdge(Block source, Block dest) {
        Edge<Block> target = new Edge<Block>(source, dest, Double.POSITIVE_INFINITY);
        for (Edge<Block> edge : edges[source.getPersonalData().getID()]) {
            if (edge.equals(target))
                return edge; // Desired edge found, return it.
        }
        // Assert: All edges for source checked.
        return target; // Desired edge not found.
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<getNumV();i++){
            stringBuilder.append(edges[i].toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
