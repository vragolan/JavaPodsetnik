package com.primer.java;

public class KonverzijaBrojeva {
    public static void main(String[] args){
        int vrednost1 = 172;
        int vrednost2 = vrednost1;
        System.out.print("Druga vrednost je: " + vrednost2);
        long longVrednost1 = vrednost2;
        System.out.print("\nLong vrednost je: " + longVrednost1);
        short shortVrednost1 = (short) longVrednost1;
        System.out.println("\nShort vrednost je: " + shortVrednost1);
        byte byteVrednost = (byte) vrednost1;
        System.out.println("Byte vrednost je: " + byteVrednost);
        double vrednost3 = 3.9999d;
        int doubleVrednost = (int) vrednost3;
        System.out.println("DoubleVrednost je: " + doubleVrednost);
    }
}
