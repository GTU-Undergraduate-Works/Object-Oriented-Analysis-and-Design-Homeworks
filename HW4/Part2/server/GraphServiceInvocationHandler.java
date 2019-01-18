/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2.server;

import duraklefkan.gtu.cse443.hw4.part2.GraphService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author efkandurakli
 */
public class GraphServiceInvocationHandler implements InvocationHandler {

    private GraphService graphService;

    public GraphServiceInvocationHandler(GraphService service) {
        this.graphService = service;
    }

 

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        synchronized (this) {
            System.out.println("Name of invoked method : " + method.getName());
            System.out.println("Invocation time : " + new SimpleDateFormat("hh:mm:ss").format(new Date()) );
            System.out.println("Id of thread that invokes this method : " + Thread.currentThread().getId());
        }

        long start = System.nanoTime();
        Object returnValue = method.invoke(graphService, objects);
        long finish = System.nanoTime();

        synchronized (this) {
            System.out.println("Elapsed time of invoked method : " + String.format("%.3f", ((finish -start) * 1e-6)) + " ms\n");
        }


        return returnValue;
    }
}
