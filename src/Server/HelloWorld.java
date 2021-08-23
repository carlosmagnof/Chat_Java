/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author gusta
 */
public interface HelloWorld extends Remote{
    public String envio (String pessoa, String mensagem) throws RemoteException;
}
