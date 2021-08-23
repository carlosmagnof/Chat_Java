/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Server.HelloWorld;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class HelloClient {
    public static void main(String[] args) {
        gui g = new gui();
        g.show();
        Pessoa p = new Pessoa();
        System.out.println("Seu nome:");
        String c = new Scanner(System.in).next();
        p.setNome(c);
        Mensagem m = new Mensagem();
        
        
        try {
          
    HelloWorld obj = (HelloWorld)Naming.lookup("//localhost:1099/HelloWorld");
    while(!"sair".equals(m.getMensagem())) {
    System.out.println("digite sua mensagem:");
        String b = new Scanner(System.in).next();
        m.setMensagem(b);
    String teste = obj.envio(p.getNome(), m.getMensagem());  
    System.out.println(teste);
    } 
        }



 catch (MalformedURLException | NotBoundException | RemoteException ex) {
System.out.println("Exception: " + ex.getMessage());
}
    }
}
