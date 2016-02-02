/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.RMI_Hello_Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import server.klasy.Gra;
import server.klasy.Gracz;

/**
 *
 * @author marekszymanski
 */
public class RMI_Hello_Implementation extends UnicastRemoteObject implements RMI_Hello_Interface
{
    Gra gra;
    
    public RMI_Hello_Implementation() throws RemoteException
    {
        
    }
    
    @Override
    public String sayHello(String name) throws RemoteException {
        String returnStatement = "Hello "+name+":)";
        return returnStatement;
    }

    @Override
    public boolean dodajOsobeDoGry(Gracz gracz) {
        if(gra.getGracze().size()<3)
        {
            gra.getGracze().add(gracz);
            return true;
        }
        else
            return false;
    }

    @Override
    public void nowaGra() {
        if(gra == null)
            gra = new Gra();
        
    }

   // @Override
    public Gra czyZaczacGre() {
        if(gra.getGracze().size() == 3)
        {
            gra.setCzyjaTura(gra.getGracze().get(0));
            return gra;
        }
        else
            return null;
    }
    
}
