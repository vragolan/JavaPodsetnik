package com.primer.java.klase.alati;

public class Uvozna extends Jabuka{
    public Uvozna(){
        super(JabukaBoja.CRVENA, JabukaVrsta.UVOZNA, 1);
    }

    @Override
    public String poreklo() {
        return "Italija";
    }
}
