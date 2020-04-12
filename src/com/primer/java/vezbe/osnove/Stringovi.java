package com.primer.java.vezbe.osnove;

public class Stringovi {
    static String ime = "Pera";
    static String s1 = "Hi";
    static String s2 = "Bye";
    static String html1 = "p";
    static String html2 = "Ovo je test.";
    static String mOut1 = "<<>>";
    static String mOut2 = "Yay";
    static String eEnd1 = "Hi";
    static String fHalf = "WooHoo";
    static String wEnd = "coding";

    public static void main(String[] args){
        HelloName(ime);
        makeAbba(s1, s2);
        makeTags(html1,html2);
        makeOutWord(mOut1, mOut2);
        extraEnd(eEnd1);
        firstHalf(fHalf);
        withoutEnd(wEnd);
        comboString(s1, s2);

    }





    public static void HelloName(String s){
        System.out.println("Hello " + s);
    }
    static void makeAbba(String s1, String s2){
        System.out.println(s1+s2+s2+s1);
    }
    static void makeTags(String s1, String s2){
        System.out.println("<"+s1+">" + s2 + "</"+s1+">");
    }
    static void makeOutWord(String s1, String s2){
        System.out.println(
                s1.substring(0,2) + s2 + s1.substring(2,4)
        );
    }
    static void extraEnd(String s1){
        StringBuilder sb = new StringBuilder();
        String temp = s1.substring(s1.length()-2, s1.length());
        sb.append(temp).append(temp).append(temp);
        System.out.println(sb);
    }
    static void firstHalf(String s1){
        System.out.println(
                s1.substring(0,s1.length()/2)
        );
    }
    static void withoutEnd(String s1){
        int duzina = s1.length();
        System.out.println(
                s1.substring(1,duzina-1)
        );
    }
    static void comboString(String s1, String s2){
        if (s1.length()<s2.length()) {
            System.out.println(s1+s2+s1);
        } else {
            System.out.println(s2+s1+s2);
        }
    }
}
