package com.primer.java.vezbe.vezba1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Duznik implements Serializable {
    private String Ime;
    private String Adresa;
    private int Telefon;

    public String getIme(){
        return Ime;
    }
    public void setIme(String Ime){
        this.Ime = Ime;
    }
    public String getAdresa(){
        return Adresa;
    }
    public void setAdresa(String Adresa){
        this.Adresa = Adresa;
    }
    public int getTelefon(){
        return Telefon;
    }
    public void setTelefon(int Telefon){
        this.Telefon = Telefon;
    }

    public Duznik(){
        Ime = "Pera";
        Adresa = "Brace Grim 26";
        Telefon = 064123456;
    }
    private  Duznik(String Ime, String Adresa, int Telefon){
        this.Ime = Ime;
        this.Adresa = Adresa;
        this.Telefon = Telefon;
    }
}
