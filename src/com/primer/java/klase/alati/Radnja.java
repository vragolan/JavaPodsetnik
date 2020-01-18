package com.primer.java.klase.alati;

public class Radnja {
    public static double saberi(String b1,String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1+d2;
    }
    public static double oduzmi(String b1, String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1-d2;
    }
    public static double deli(String b1, String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1/d2;
    }
    public static double mnozi(String b1, String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1*d2;
    }
}
