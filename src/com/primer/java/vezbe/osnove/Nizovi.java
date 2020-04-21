package com.primer.java.vezbe.osnove;

public class Nizovi {
    static String s1[] = {"4", "2", "6"};
    static int s2[] = {1, 2, 3};
    static int s3[] = {1, 2, 3};
    static int s4[] = {2, 2, 1};
    public static void main(String args[]){
        vrati6(s1);
        sameFirstLast(s2);
        commonEnd(s3,s4);
    }
    //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    static void vrati6(String s[]){
        if (Integer.parseInt(s[0]) == 6){
            if(Integer.parseInt(s[s.length-1]) == 6) {
                System.out.println("Sadrzi 6 na prvom i poslednjem mestu.");
            } else {System.out.println("Sadrzi 6 na prvom mestu.");}

        } else if(Integer.parseInt(s[s.length-1]) == 6){
            System.out.println("Sadrzi 6 na poslednjem mestu.");
        } else {
            System.out.println("Ne sadrzi 6.");
        }
    }

    //Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
    static void sameFirstLast(int s[]){
        if (s.length > 1 && s[0] == s[s.length-1]){
            System.out.println("Prvi i poslednji element su isti.");
        } else {
            System.out.println("Prvi i poslednji element su razliciti.");
        }
    }

    //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
    static void commonEnd(int s1[], int s2[]){
        if (s1[0] == s2[0]){
            if (s1[s1.length-1] == s2[s2.length-1]){
                System.out.println("I prvi i poslednji su im isti.");
            } else {System.out.print("Prvi element im je isti.");}
        } else if (s1[s2.length-1] == s2[s2.length-1]){
            System.out.println("Poslednji elementi su im isti.");
        } else {System.out.println("Nemaju istih elemenata.");}
    }




}
