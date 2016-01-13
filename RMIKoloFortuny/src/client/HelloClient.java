/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import implementations.RMI_Hello_Implementation;
import interfaces.RMI_Hello_Interface;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author marekszymanski
 */
public class HelloClient {
    public static void main(String[] argv)
    {
        RMI_Hello_Interface rmiHello = null;
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost", 6999);
            rmiHello = (RMI_Hello_Interface)Naming.lookup("//127.0.0.1:6999/RMIExample");
            System.out.println("Nawiązuję połączenie z serwerem");
            String imie = "Marek";
            String wynik = rmiHello.sayHello(imie);
            System.out.println(wynik);
        }
        catch (Exception e) 
        {
            System.out.println("Client ERROR "+e);
        }
    }
}
