/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author marekszymanski
 */
public interface RMI_Hello_Interface extends Remote{
    public String sayHello(String name) throws RemoteException;
}
