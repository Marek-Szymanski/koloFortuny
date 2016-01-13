/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.RMI_Hello_Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author marekszymanski
 */
public class RMI_Hello_Implementation extends UnicastRemoteObject implements RMI_Hello_Interface
{
    public RMI_Hello_Implementation() throws RemoteException
    {
        
    }
    
    @Override
    public String sayHello(String name) throws RemoteException {
        String returnStatement = "Hello "+name+":)";
        return returnStatement;
    }
    
}
