package com.primer.java.klase.alati;

public enum JabukaVrsta {
    DOMACA("Domaca"), UVOZNA("Uvozna"), PRSKANA("Prskana"), NEPRSKANA("Neprskana");
    private String Ime;

    JabukaVrsta(String Ime){
        this.Ime = Ime;
    }

    public String toString(){
        return Ime;
    }
}
