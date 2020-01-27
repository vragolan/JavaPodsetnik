package com.primer.java.fajlovi;

import java.io.Serializable;

public class Osoba implements Serializable {
    private String ime = "Pera";
    private int godine = 24;

    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public int getGodine(){
        return godine;
    }
    public void setGodine(int godine){ this.godine = godine;}

}
