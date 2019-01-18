/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2.server;

import duraklefkan.gtu.cse443.hw4.part2.Edge;
import duraklefkan.gtu.cse443.hw4.part2.Graph;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author efkandurakli
 */
public class MapGraph<E> implements Graph<E> {

    private Map<E, Set<Edge<E>>> vertices;
    int numberOfEdges;

    /**
     * Creates part2.server.MapGraph with specified parameters
     * @param vrtcs vertices array
     * @param edges edges array
     */
    public MapGraph(E[] vrtcs, Edge[] edges) {
        vertices = new HashMap<>();
        for (int i = 0; i < vrtcs.length; ++i)
            addVertex(vrtcs[i]);
        for (int i = 0; i < edges.length; ++i)
            addEdge((E) edges[i].getSource(), (E) edges[i].getDestination(), edges[i].getWeight());


    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNumberOfVertex() {
        return vertices.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<E, Set<Edge<E>>> getVertices() {
        return vertices;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasVertex(E vertex) {
        return vertices.containsKey(vertex);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasEdge(E source, E destination) {
        if (hasVertex(source) && hasVertex(destination))
            return vertices.get(source).contains(destination);
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addVertex(E vertex) {
        if (!hasVertex(vertex)) vertices.put(vertex, new HashSet<>());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addEdge(E source, E destination, double weight) {
        if (!hasVertex(source)) addVertex(source);
        if (!hasVertex(destination)) addVertex(destination);
        if (!hasEdge(source, destination)) numberOfEdges++;
        vertices.get(source).add(new Edge<>(source, destination, weight));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterator iterator() {
        return vertices.keySet().iterator();
    }
    
        /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        for (E v: vertices.keySet()) {
            sb.append(v.toString() + ": ");
            for (Edge edge: vertices.get(v))
                sb.append(edge.getDestination() + "( weight : " + edge.getWeight() + ")" + "  ");
            sb.append("\n");
        }
        
        return sb.toString();

    }
}