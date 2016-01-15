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

    public List<String> getLiteryA() {
        return literyA;
    }

    public void setLiteryA(List<String> literyA) {
        this.literyA = literyA;
    }

    public List<String> getLiteryB() {
        return literyB;
    }

    public void setLiteryB(List<String> literyB) {
        this.literyB = literyB;
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

    private void init()
    {
        gracze = new ArrayList<>();
        literyA = new ArrayList<>();
        literyB  = new ArrayList<>();
        haslo = "Ala ma kota";
        for(int i=0; i<haslo.length(); i++)
            odgadywaneElementyHasla += "_";
        wylosowanaKwotaDoWygrania = 0;
        
    }
}
