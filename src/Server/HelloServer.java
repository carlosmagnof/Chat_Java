/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author gusta
 */
public class HelloServer extends UnicastRemoteObject implements HelloWorld {
public HelloServer() throws RemoteException {
super();
}
    @Override
    public String envio(String pessoa, String mensagem) throws RemoteException {
    return pessoa + " diz: " + mensagem;
    }

}

