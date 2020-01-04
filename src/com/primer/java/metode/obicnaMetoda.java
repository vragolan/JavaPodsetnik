package com.primer.java.metode;

public class obicnaMetoda {

    static String[] meseci = {"Januar", "Februar", "Mart",
            "April", "Maj", "Jun", "Jul", "Avgust",
            "Septembar", "Oktobar", "Novembar", "Decembar"};

    public static void main(String args[]){
        napisi("Prvo pokretanje");
        napisi("Drugo pokretanje");
        napisi("Trece pokretanje");
    }

    static void napisi(){
        for (int i = 0; i < meseci.length; i++)
        System.out.println(meseci[i]);
    }
    static void napisi(String s){
        System.out.println(s);
        for (int i = 0; i < meseci.length; i++) {
            System.out.println(meseci[i]);
        }
    }
}
