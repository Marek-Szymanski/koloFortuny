/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import implementations.RMI_Hello_Implementation;
import interfaces.RMI_Hello_Interface;
import static java.lang.Thread.sleep;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.klasy.Gra;
import server.klasy.Gracz;

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
            Registry reg = LocateRegistry.getRegistry("localhost", 6998);
            rmiHello = (RMI_Hello_Interface)Naming.lookup("//127.0.0.1:6998/RMIExample");
            System.out.println("Nawiązuję połączenie z serwerem");
            
            //na teraz bez menu zaczęcia gry
            rmiHello.nowaGra();
            Gra gra = null;
            Gracz gracz = new Gracz("Gracz ");
            //stara się o dołączenie do gry
            gracz = rmiHello.dodajOsobeDoGry(gracz);
            if(gracz!=null)
            {
                System.out.println("Sukces");
            
                //czekam czy zebrali się wszyscy gracze
                while(gra == null)
                {
                    System.out.println("Czy mogę zagrać?");
                    gra = rmiHello.czyZaczacGre();
                    Thread.sleep(1000);
                }
                System.out.println("START");
                //zacznij GUI Gry
                GuiGra guiGra = new GuiGra(gra, gracz);
                while(true)
                {
                    if(gra.getCzyjaTura().getNazwa().equals(gracz.getNazwa()) && guiGra.nowaTura)
                    {
                        System.out.println("gra gracz "+gra.getCzyjaTura().getNazwa());
                        
                        guiGra.nowaTura = rmiHello.setGra(gra);
                        
                        
                        sleep(1000);
                        //
                    }
                    else
                    {
                        gra = rmiHello.getGra();
                        guiGra.gra = gra;
                        guiGra.uaktualnijStanGry();
                    }
                    sleep(1000);
                    if(gra.isKoniecGry())
                    {
                        guiGra.koniecGui();
                        break;
                    }
                       
                }
                
            }
        }
        catch (Exception e) 
        {
            System.out.println("Client ERROR "+e);
        }
    }
}
