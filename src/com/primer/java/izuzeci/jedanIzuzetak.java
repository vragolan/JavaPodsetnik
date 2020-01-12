package com.primer.java.izuzeci;

public class jedanIzuzetak {
    public static void main(String args[]){
        String s1 = "Welcome";
        char[] karakteri = s1.toCharArray();

        try {
            char lastChar = karakteri[karakteri.length];
            System.out.println(lastChar);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Prevazidjena duzina niza.");
        }
    }
}
