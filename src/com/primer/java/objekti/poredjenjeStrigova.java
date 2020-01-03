package com.primer.java.objekti;

public class poredjenjeStrigova {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";

        if (s1 == s2){
            System.out.println("Isti su");
        } else {
            System.out.println("Razliciti su");
        }
        if (s1 == s3){
            System.out.println("Isti su");
        } else {
            System.out.println("Razliciti su");
        }

        String deo1 = "Hello";
        String deo2 = "World";
        String ceo = deo1 + " " + deo2;
        String s4 = "Hello World";

        if (ceo == s4){
            System.out.println("Isti su");
        } else {
            System.out.println("Razliciti su");
        }

        if (ceo.equals(s4)){
            System.out.println("Isti su");
        } else {
            System.out.println("Razliciti su");
        }
    }
}
