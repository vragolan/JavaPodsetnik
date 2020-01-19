package com.primer.java.klase.alati;

public class Domaca extends Jabuka{
    public Domaca(){
        super(JabukaBoja.ZELENA, JabukaVrsta.DOMACA, 3);
    }

    @Override
    public String poreklo() {
        return "Srbija";
    }
}
