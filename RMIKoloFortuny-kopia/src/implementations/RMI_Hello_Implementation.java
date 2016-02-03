/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.RMI_Hello_Interface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public Gracz dodajOsobeDoGry(Gracz gracz) {
        if(gra.getGracze().size()<3)
        {
//            System.out.println("NAZWA GRACZ: "+gracz.getNazwa());
            gra.getGracze().add(gracz); 
            gracz.setNazwa(gracz.getNazwa()+Integer.toString(gra.getGracze().size()));
            System.out.println("NAZWA GRACZ: "+gracz.getNazwa());
            return gracz;
        }
        else
            return null;
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

    @Override
    public Gra getGra() throws RemoteException {
        return gra;
    }

    @Override
    public boolean setGra(Gra gra) throws RemoteException 
    {
        System.out.println("Ustawiam grę");
        this.gra = gra;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RMI_Hello_Implementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Gracz gracz = gra.getNextGracz();
        System.out.println("Zmeniam gracza na "+gracz.getNazwa());
        gra.setCzyjaTura(gracz);
        return false;
    }
    
    
}
