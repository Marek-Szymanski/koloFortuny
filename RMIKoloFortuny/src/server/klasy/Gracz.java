/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.klasy;

import java.io.Serializable;

/**
 *
 * @author marekszymanski
 */
public class Gracz implements Serializable
{
    String nazwa;
    int stanKonta;

    public Gracz(String nazwa) {
        this.nazwa = nazwa;
        stanKonta = 0;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }
}
