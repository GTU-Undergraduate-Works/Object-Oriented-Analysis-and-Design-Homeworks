/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duraklefkan.gtu.cse443.hw4.part2.client;

import duraklefkan.gtu.cse443.hw4.part2.Edge;
import duraklefkan.gtu.cse443.hw4.part2.Graph;
import duraklefkan.gtu.cse443.hw4.part2.GraphService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efkandurakli
 */
public class Client {


    public static void main(String[] args) {


        try {
            GraphService graphService = (GraphService) Naming.lookup("rmi://localhost:1800"+
                    "/BulutCizge");


            List<Edge<String>> edges = new ArrayList<>();
            
            edges.add(new Edge<>("Edirne" , "Erzurum", 5.0));
            edges.add(new Edge<>("Erzurum" , "Edirne", 5.0));         
            edges.add(new Edge<>("Erzurum" , "Antalya", 2.0));           
            edges.add(new Edge<>("Antalya" , "Erzurum", 2.0));           
            edges.add(new Edge<>("Antalya" , "Diyarbakır", 5.0));           
            edges.add(new Edge<>("Diyarbakır" , "Antalya", 5.0));
            edges.add(new Edge<>("İzmir" , "Antalya", 1.0));
            edges.add(new Edge<>("Antalya" , "İzmir", 1.0));           
            edges.add(new Edge<>("Ankara" , "Diyarbakır", 8.0));    
            edges.add(new Edge<>("Diyarbakır" , "Ankara", 8.0));
            edges.add(new Edge<>("Kars" , "Gaziantep", 3.0));
            edges.add(new Edge<>("Gaziantep" , "Kars", 3.0));
            edges.add(new Edge<>("İzmir" , "Ankara", 6.0));
            edges.add(new Edge<>("Ankara" , "İzmir", 6.0));
            edges.add(new Edge<>("İstanbul" , "İzmir", 3.0));
            edges.add(new Edge<>("İzmir" , "İstanbul", 3.0));
            edges.add(new Edge<>("İstanbul" , "Ankara", 2.0));
            edges.add(new Edge<>("Ankara" , "İstanbul", 2.0));
            edges.add(new Edge<>("İstanbul" , "Trabzon", 3.0));
            edges.add(new Edge<>("Trabzon" , "İstanbul", 3.0));
            edges.add(new Edge<>("Ankara" , "Trabzon", 6.0));
            edges.add(new Edge<>("Trabzon" , "Ankara", 6.0));
            edges.add(new Edge<>("Ankara" , "Kars", 3.0));
            edges.add(new Edge<>("Kars" , "Ankara", 3.0));
          
            String[] vertices = new String[5];
            vertices[0] = "Erzincan";
            vertices[1] = "Bayburt";
            vertices[2] = "Sivas";
            vertices[3] = "Batman";
            vertices[4] = "Kocaeli";
            
            Graph g = graphService.generateGraph(edges.toArray(new Edge[edges.size()]), vertices);
            
            System.out.println("GRAPH GENERATED.");
            System.out.println("Generated Graph :");
            System.out.println(graphService.graphToString(g));
           
            Object[] finishOrderBFS = graphService.breadthFirstSearch(g);
            Object[] finishOrderDFS = graphService.depthFirstSearch(g);
            
            System.out.print("Breadth First Search Order of Graph : ");
            printTraversal(finishOrderBFS);
            System.out.println();
            
            System.out.print("Depth First Search Order of Graph : ");
            printTraversal(finishOrderDFS);
            System.out.println();
            
            
   
                    

        }
        catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    
    private static void printTraversal(Object[] objects) {
        
        if (objects.length > 1)
            System.out.print(objects[0]);
        for (int i = 1; i < objects.length; ++i) {
            System.out.print(" ==> " + objects[i]);
        }
        System.out.println();
        
    }
}
