/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author gusta
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
HelloServer obj = new HelloServer();
 LocateRegistry.createRegistry(1099);
Naming.rebind("//localhost/HelloWorld", obj);
} catch (Exception ex) {
System.out.println("Exception: " + ex.getMessage());
}
    }
    
}
