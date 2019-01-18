/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2.server;

import duraklefkan.gtu.cse443.hw4.part2.Edge;
import duraklefkan.gtu.cse443.hw4.part2.Graph;
import duraklefkan.gtu.cse443.hw4.part2.GraphService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author efkandurakli
 * @param <E>
 */
public class BulutCizgeGraphService<E> extends UnicastRemoteObject
        implements GraphService<E> {

    private int finisIndex;

    protected BulutCizgeGraphService() throws RemoteException {
        super();
        finisIndex = 0;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Graph<E> generateGraph(Edge[] edges, E[] vertices) throws RemoteException {
        return new MapGraph<>(vertices, edges);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public E[] breadthFirstSearch(Graph graph) throws RemoteException {

        Queue<E> theQueue = new LinkedList<E>();
        Map<E, Boolean> visited = new HashMap<>();
        E[] finishOrder = (E[]) new Object[graph.getNumberOfVertex()];
        int finishIndex = 0;
        Iterator itr = graph.iterator();
        if (itr.hasNext()) {
            E vertex = (E) itr.next();
            visited.put(vertex, true);
            theQueue.offer(vertex);
            finishOrder[finishIndex++] = vertex;
        }
        while (itr.hasNext()) {
            E vertex = (E) itr.next();
            visited.put(vertex, false);
        }

        while (!theQueue.isEmpty()) {
            E current = theQueue.remove();
            itr = graph.iterator();
            while (itr.hasNext()) {
                E neighbor = (E) itr.next();
                if (!visited.get(neighbor)) {
                    visited.put(neighbor, true);

                    theQueue.offer(neighbor);
                    finishOrder[finishIndex++] = neighbor;

                }
            }
        }
        return finishOrder;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public E[] depthFirstSearch(Graph graph) throws RemoteException {
        E[] finishOrder = (E[]) new Object[graph.getNumberOfVertex()];
        int finishIndex = 0;
        Iterator itr = graph.iterator();
        Map<E, Boolean> visited = new HashMap<>();
        while (itr.hasNext()) {
            E vertex = (E) itr.next();
            visited.put(vertex, false);
        }
        itr = graph.iterator();
        while (itr.hasNext()) {
            E vertex = (E) itr.next();
            if (!visited.get(vertex))
                this.depthFirstSearchHelper(graph, visited, finishOrder,vertex);
        }
        return finishOrder;
    }
    
    /**
     * Recursive helper method to traverse graph depth first search
     * @param graph the graph
     * @param visited boolean visited array
     * @param finishOrder finish order of traversal
     * @param start start vertex
     */
    private void depthFirstSearchHelper(Graph<E> graph, Map<E, Boolean> visited, E[] finishOrder, E start) {
        visited.put(start, true);
        Iterator itr = graph.getVertices().get(start).iterator();
        while (itr.hasNext()) {
            Edge neighbor = (Edge) itr.next();
            if (!visited.get(neighbor.getDestination())) {
                this.depthFirstSearchHelper(graph, visited, finishOrder, (E) neighbor.getDestination());
            }
        }
        finishOrder[finisIndex++] = start;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String graphToString(Graph graph) throws RemoteException {
        return graph.toString();
    }
}
