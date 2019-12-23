package com.primer.java;

public class Math {
    public static void main(String[] args){
        int prvi = 56;
        int drugi = 48;

        int sabiranje = prvi + drugi;
        System.out.println("Zbir je: " + sabiranje);
        int oduzimanje = prvi - drugi;
        System.out.println("Razlika je: " + oduzimanje);
        int mnozenje = prvi * drugi;
        System.out.println("Pomnozeno je: " + mnozenje);
        double deljenje = (double) prvi / drugi;
        System.out.println("Deljenje je: " + deljenje);
        int ostatak = prvi % drugi;
        System.out.println("Ostatak je: " + ostatak);

        long zaokruzivanje = java.lang.Math.round(deljenje);
        System.out.println("Zaokruzeno je: " + zaokruzivanje);
        int apsolutna = (int) java.lang.Math.abs(deljenje);
        System.out.println("Apsolutno je: " + apsolutna);

    }
}
