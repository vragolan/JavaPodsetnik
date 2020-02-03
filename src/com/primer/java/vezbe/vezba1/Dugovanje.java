package com.primer.java.vezbe.vezba1;

public class Dugovanje {
    private String stvar;
    private int kolicina;
    private Duznik d1;

    public Dugovanje() {
        this.d1 = null;
        this.kolicina = 0;
        this.stvar = null;
    }

    public void setStvar(String stvar){
        this.stvar = stvar;
    }
    public String getStvar(){
        return stvar;
    }
    public void setKolicina(int kolicina){
        this.kolicina = kolicina;
    }
    public int getKolicina(){
        return kolicina;
    }
    public void setDuznik(Duznik d1){
        this.d1 = d1;
    }
    public Duznik getDuznik(){
        return d1;
    }


    public Dugovanje(String stvar, int kolicina, Duznik d1){
        this.stvar = stvar;
        this.kolicina = kolicina;
        this.d1 = d1;
    }
}
