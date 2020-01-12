package com.primer.java.strukture;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class nizovi {
    public static void main(String args[]){
        int[] ints = {3, 9, 4, 7, 1, 5, 2, 6, 8};
        String[] stringovi = {"Beli", "Zuti", "Plavi"};

        System.out.println("Ispis integera: ");
        for (int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }
        System.out.println("Ispis stringova: ");
        for (String s:stringovi) {
            System.out.println(s);
        }
        // sortiranje
        System.out.println("Soritrani int: ");
        Arrays.sort(ints);
        Arrays.sort(stringovi);
        int b = 0;
        while (b<ints.length){
            System.out.println(ints[b]);
            b++;
        }
        b=0;
        System.out.println("Sortirani stringovi: ");
        do{
            System.out.println(stringovi[b]);
            b++;
        } while (b<stringovi.length);
        // kopiranje
        System.out.println("Kopirani niz: ");
        int[] kopirani = new int[5];
        System.arraycopy(ints, 4,kopirani,0, 5);
        for (int i:kopirani) {
            System.out.print(i+"; ");
        }
    }
}
