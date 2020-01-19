package com.primer.java.klase.alati;

public class Jabuka {
    public static final String DOMACA = "Domaca";
    public static final String UVOZNA = "Uvozna";

    private String ime = "Zelena";
    private String vrsta = UVOZNA;
    private int vrednost = 3;

    public Jabuka(){}
    public Jabuka(String ime, String vrsta, int vrednost){
        this.ime = ime;
        this.vrsta = vrsta;
        this. vrednost = vrednost;
    }

    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getVrsta(){
        return vrsta;
    }
    public void setVrsta(String vrsta){
        this.vrsta = vrsta;
    }
    public int getVrednost(){
        return vrednost;
    }
    public void setVrednost(int vrednost){
        this.vrednost = vrednost;
    }
}
