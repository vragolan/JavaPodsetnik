package com.primer.java.klase.alati;

public enum JabukaBoja {
    ZELENA("Zelena"), CRVENA("Crvena"), PLAVA("Plava");
    private String Boja;

    JabukaBoja(String Boja){
        this.Boja = Boja;
    }

    public String toString() {
        return Boja;
    }
}
