package com.primer.java.klase.alati;



public abstract class Jabuka {
    //public static final String DOMACA = "Domaca";
    //public static final String UVOZNA = "Uvozna";

    private JabukaBoja Boja = JabukaBoja.CRVENA;
    private JabukaVrsta Vrsta = JabukaVrsta.UVOZNA;
    private int Vrednost = 3;

    public Jabuka(JabukaBoja boja, JabukaVrsta vrsta, int vrednost){
        this.Boja = boja;
        this.Vrsta = vrsta;
        this.Vrednost = vrednost;
    }

    public JabukaBoja getIme(){
        return Boja;
    }
    public void setIme(String ime){
        this.Boja = Boja;
    }
    public JabukaVrsta getVrsta(){
        return Vrsta;
    }
    public void setVrsta(JabukaVrsta vrsta){
        this.Vrsta = vrsta;
    }
    public int getVrednost(){
        return Vrednost;
    }
    public void setVrednost(int vrednost){
        this.Vrednost = vrednost;
    }

    public abstract String poreklo();

}
