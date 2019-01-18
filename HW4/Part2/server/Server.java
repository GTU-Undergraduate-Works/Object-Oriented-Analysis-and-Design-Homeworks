/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2.server;

import duraklefkan.gtu.cse443.hw4.part2.GraphService;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author efkandurakli
 */
public class Server {


    public static void main(String[] args) {

        try {

            GraphService graphService = new BulutCizgeGraphService();
            GraphService proxy = (GraphService) Proxy.newProxyInstance(graphService.getClass().getClassLoader(),
                                                        graphService.getClass().getInterfaces(),
                                                        new GraphServiceInvocationHandler(graphService));

            LocateRegistry.createRegistry(1800);

            // Binds the remote object by the name
            Naming.rebind("rmi://localhost:1800"+
                    "/BulutCizge",UnicastRemoteObject.exportObject(proxy, 0));

        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}