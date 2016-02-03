/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import server.klasy.Gra;
import server.klasy.Gracz;

/**
 *
 * @author marekszymanski
 */
public interface RMI_Hello_Interface extends Remote{
    
    
    public String sayHello(String name) throws RemoteException;
    //serwer tworzy u siebie Gre
    public void nowaGra() throws RemoteException;
    //klient chce dodać siebie do Gry
    public Gracz dodajOsobeDoGry(Gracz gracz) throws RemoteException;
    //klient pyta czy są wszyscy gracze, w odpowiedzi dostaje null gdny nie lub Gre jeśli wszyscy już są
    public Gra czyZaczacGre() throws RemoteException;
    public Gra getGra() throws RemoteException;
    public boolean setGra(Gra gra) throws RemoteException;
}
