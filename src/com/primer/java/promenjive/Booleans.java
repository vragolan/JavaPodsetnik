package com.primer.java.promenjive;

public class Booleans {
    static boolean bDef;
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = !b1;

        System.out.println("B1 je: " + b1);
        System.out.println("B2 je: " + b2);
        System.out.println("Bdef je: " + bDef);
        System.out.println("B3 je: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("B4 je: " + b4);

    }
}
