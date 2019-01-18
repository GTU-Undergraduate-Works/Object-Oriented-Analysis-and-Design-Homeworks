/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author efkandurakli
 */
public interface GraphService<E> extends Remote {

    /**
     * Generate part2.Graph with given parameters.
     * @param edges the edges
     * @param vertices the vertices
     * @return generated graph with given fields
     * @throws RemoteException the remote exception
     */
    Graph generateGraph(Edge[] edges, E[] vertices) throws RemoteException;


    /**
     * Returns finish order of depth first traversal
     * @param graph the part2.Graph
     * @return finish order of depth first traversal
     * @throws RemoteException the remote exception
     */
    E[] depthFirstSearch(Graph graph) throws RemoteException;

    /**
     * Returns finish order of breadth first traversal
     * @param graph the part2.Graph
     * @return finish order of breadth first traversal
     * @throws RemoteException the remote exception
     */
    E[] breadthFirstSearch(Graph graph) throws RemoteException;

    /**
     * Returns string representation of given graph.
     * @param graph  the part2.Graph
     * @return string representation of given graph
     * @throws RemoteException the remote exception
     */
    String graphToString(Graph graph) throws RemoteException;



}