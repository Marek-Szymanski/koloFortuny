/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.klasy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marekszymanski
 */
public class Gra implements Serializable
{
    List <Gracz> gracze;
    List <String> literyA;
    List <String> literyB;
    String haslo;
    String odgadywaneElementyHasla;
    Gracz czyjaTura;
    int wylosowanaKwotaDoWygrania;
    String kupioneLitery="";

    public Gra() 
    {
        init();
    }
    
    
    
    
    
    
    
    
    
    
    

    public List<Gracz> getGracze() {
        return gracze;
    }

    public void setGracze(List<Gracz> gracze) {
        this.gracze = gracze;
    }


    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getOdgadywaneElementyHasla() {
        return odgadywaneElementyHasla;
    }

    public void setOdgadywaneElementyHasla(String odgadywaneElementyHasla) {
        this.odgadywaneElementyHasla = odgadywaneElementyHasla;
    }

    public Gracz getCzyjaTura() {
        return czyjaTura;
    }

    public void setCzyjaTura(Gracz czyjaTura) {
        this.czyjaTura = czyjaTura;
    }

    public int getWylosowanaKwotaDoWygrania() {
        return wylosowanaKwotaDoWygrania;
    }

    public void setWylosowanaKwotaDoWygrania(int wylosowanaKwotaDoWygrania) {
        this.wylosowanaKwotaDoWygrania = wylosowanaKwotaDoWygrania;
    }

    public String getKupioneLitery() {
        return kupioneLitery;
    }

    public void setKupioneLitery(String kupioneLitery) {
        this.kupioneLitery = kupioneLitery;
    }

    private void init()
    {
        gracze = new ArrayList<>();
        literyA = new ArrayList<>();
        literyB  = new ArrayList<>();
        haslo = "ALA MA KOTA";
        odgadywaneElementyHasla = haslo;
        
        //"Szyfrowanie hasła"
        for(int i=0; i<haslo.length(); i++)
        {
            if(odgadywaneElementyHasla.charAt(i) != ' ')
            {
                StringBuilder sb = new StringBuilder(odgadywaneElementyHasla);
                sb.setCharAt(i, '?');
                odgadywaneElementyHasla = sb.toString();
            }
            
                
        }
            
        System.out.println(odgadywaneElementyHasla);
        wylosowanaKwotaDoWygrania = 0;
        
    }
}
