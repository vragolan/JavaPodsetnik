package com.primer.java.strukture;

import java.util.*;

public class kretanjeKrozListeMape {
    public static void main(String args[]){
        System.out.println("Sortirani podaci - Lista");
        List<String> lista = new ArrayList<>();
        lista.add("Srbija");
        lista.add("Francuska");
        lista.add("Nemacka");
        System.out.println(lista);
        // Iterator
        Iterator<String> iterator = lista.iterator();
        System.out.println("Ispis pomocu iteratora");
        while (iterator.hasNext()) {
            String vrednost = iterator.next();
            System.out.println(vrednost);
        }
        System.out.println("Ispis pomocu klasicnog for each");
        for(String vrednost:lista){
            System.out.println(vrednost);
        }
        System.out.println("Ispis pomocu forEach metode");
        lista.forEach(System.out::println);

        // hashmapa

        System.out.println("Nesortirani podaci - HashMapa");
        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("Srbija","Beograd");
        mapa.put("Nemacka","Berlin");
        mapa.put("Francuska","Pariz");
        System.out.println(mapa);
        // iterator hash mapa
        Set<String> kljucevi = mapa.keySet();
        Iterator<String> iterator1 = kljucevi.iterator();
        while (iterator1.hasNext()){
            String kljuc = iterator1.next();
            System.out.println("Prestonica " + kljuc + " je " + mapa.get(kljuc));
        }
        // hash mapa for each
        for (String kljuc:kljucevi){
            System.out.println("Prestonica " + kljuc + " je " + mapa.get(kljuc));
        }

    }
}
