package com.primer.java.strukture;

import java.util.HashMap;
import java.util.Map;

public class hashmapa {
    public static void main(String args[]){
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Srbija", "Beograd");
        mapa.put("Francuska", "Pariz");
        mapa.put("Nemacka", "Berlin");
        System.out.println(mapa);
        mapa.put("Spanija", "Madrid");
        System.out.println(mapa);
        // pristup elementu
        String prestonica = mapa.get("Nemacka");
        System.out.println("Prestonica nemacke je: " + prestonica);
        // brisanje
        mapa.remove("Srbija");
        System.out.println(mapa);
    }
}
