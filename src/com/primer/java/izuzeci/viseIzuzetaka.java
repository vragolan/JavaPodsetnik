package com.primer.java.izuzeci;

public class viseIzuzetaka {
    public static void main(String args[]){
        String s1 = "Welcome";
        char[] karakteri = s1.toCharArray();

        try {
            char lastChar = karakteri[karakteri.length -1];
            System.out.println(lastChar);
            String s2 = s1.substring(10);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Prevazidjena duzina niza.");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Prevazidjenaj duzina stringa");
        }
    }
}
