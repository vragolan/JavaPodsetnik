package com.primer.java.metode;

import java.util.Scanner;

public class razliciteMetode {
    public static void main(String args[]){
        String s1 = ulaz("Unesite prvu vrednost: ");
        String s2 = ulaz("Unesite drugu vrednost: ");
        String s3 = ulaz("Unesite trecu vrednost: ");

        double rezultat1 = saberi(s1,s2);
        double rezultat2 = saberi(s1,s2,s3);
        double rezultat3 = saberi(s1,s2,s3,s2,s3,s2,s3);
        System.out.println("Rezultat za prvu i drugu je: " +rezultat1);
        System.out.println("Rezultat za sve tri je: " +rezultat2);
        System.out.println("Rezultat xxx: " +rezultat3);
    }

    static String ulaz(String u){
        System.out.print(u);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static double saberi(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double rez = d1 + d2;
        return rez;
    }
    static double saberi(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double rez = d1 + d2 + d3;
        return rez;
    }
    static  double saberi(String ... vrednosti){
        double rez = 0;
        for (String vrednost : vrednosti){
            rez += Double.parseDouble(vrednost);
        }
        return rez;
    }

}
