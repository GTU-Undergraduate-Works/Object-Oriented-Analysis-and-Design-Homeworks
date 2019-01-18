/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author efkandurakli
 */

public class Edge<E> implements Serializable {

    /** source vertex */
    private E source;

    /** destination vertex */
    private E destination;

    /** weight of edge */
    private double weight;

    /**
     * Creates part2.Edge object with given source and
     * destination vertex with 1.0 weight.
     * @param source the source vertex
     * @param destination the destination vertex
     */
    public Edge(E source, E destination) {
        this(source, destination, 1.0);
    }

    /**
     * Creatates part2.Edge object with specified fields.
     * @param source the source vertex
     * @param destination the destination vertex
     * @param weight the weight
     */
    public Edge(E source, E destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    /**
     * This is getter which gets source vertex of this edge
     * @return source vertex of this edge
     */
    public E getSource() {
        return source;
    }

    /**
     * This is getter which gets destination vertex of this edge
     * @return destination vertex of this edge
     */
    public E getDestination() {
        return destination;
    }

    /**
     * This is getter which gets weigh of this edge
     * @return weight of this edge
     */
    public double getWeight() {
        return weight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge<?> edge = (Edge<?>) o;
        return Double.compare(edge.weight, weight) == 0 &&
                Objects.equals(source, edge.source);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(source, destination, weight);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return source.toString() + " -> " + destination.toString();
    }
}
