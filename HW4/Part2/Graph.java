/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author efkandurakli
 */

public interface Graph<E> extends Serializable, Iterable<E> {

    /**
     * This is getter which gets number of edges in this graph
     * @return number of edges in this graph
     */
    int getNumberOfEdges();

    /**
     * This is getter which gets number of vertices in this graph
     * @return number of vertices in this graph
     */
    int getNumberOfVertex();

    /**
     * Checks whether graph has given vertex
     * @param vertex the vertex to check
     * @return true if graph has given vertex, false if not
     */
    boolean hasVertex(E vertex);

    /**
     * Checks whether graph has given vertex
     * @param source the source vertex of edge
     * @param destination the destination vertex of edge
     * @return true, if graph has given edge, false if not
     */
    boolean hasEdge(E source, E destination);

    /**
     * if graph does not have given vertex,
     * adds given vertex to this graph
     * @param vertex the vertex to add
     */
    void addVertex(E vertex);

    /**
     * if graph has given source or destination vertex,
     * adds edge with given source,destination and edge.
     * @param source the source vertex
     * @param destination the destination vertex
     * @param weight the weigh
     */
    void addEdge(E source, E destination, double weight);

    Map<E, Set<Edge<E>>> getVertices();
}