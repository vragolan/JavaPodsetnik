package com.primer.java.objekti;

public class Stringovi {
    public static void main(String[] args){
        String s1 = "Ovo je string";
        String s2 = new String("Ovo je string");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Ovo";
        String s4 = "string";
        System.out.println(s3 + " je " + s4);

        char[] karakteri = {'S', 't', 'r', 'i', 'n', 'g'};
        for (char c : karakteri){
            System.out.println(c);
        }
        String s5 = new String(karakteri);
        System.out.println(s5);

        char[] karakteri2 = s5.toCharArray();
        System.out.println(karakteri2[0]);
    }
}
