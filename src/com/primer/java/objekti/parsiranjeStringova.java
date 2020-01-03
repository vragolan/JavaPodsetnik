package com.primer.java.objekti;

public class parsiranjeStringova {
    public static void main(String args[]){
        String s1 = "Hello world";
        System.out.println("Duzina prvog stringa: " + s1.length());

        int pozicija = s1.indexOf("world");
        System.out.println("Pozicija u stringu je: " + pozicija);

        String sub = s1.substring(6);
        System.out.println(sub);

        String s2 = "Welcome!                ";
        int duzina = s2.length();
        System.out.println("Duzina drugog stringa: " + duzina);
        String s3 = s2.trim();
        System.out.println("Prava duzina drugog stringa: " + s3.length());
    }
}
