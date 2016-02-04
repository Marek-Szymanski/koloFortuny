/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import implementations.RMI_Hello_Implementation;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.klasy.Gra;


/**
 *
 * @author marekszymanski
 */
public class HelloServer {
    public static void main(String[] argv)
    {
        if (System.getSecurityManager() == null){
           System.setSecurityManager(new SecurityManager());
        }
        try
        {
            LocateRegistry.createRegistry(6998);
            Registry reg = LocateRegistry.getRegistry();
            RMI_Hello_Implementation rmiHello = new RMI_Hello_Implementation();
            Naming.rebind("//127.0.0.1:6998/RMIExample", rmiHello);
            System.out.println("Server is ready");
            
            
        }
        catch (Exception e)
        {
            System.out.println("Server ERROR "+e);
        }
    }
}
