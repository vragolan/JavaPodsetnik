package com.primer.java.izuzeci;

public class prilagodjeniIzuzeci {
    public static void main(String args[]){
        String s1 = "Welcome";
        char[] karakteri = s1.toCharArray();

        try {
            if (karakteri.length < 10) {
                throw (new Exception("Moja poruka!"));
            }
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
