package com.primer.java.promenjiveCopy;

public class MaxValues {
    public static void main(String[] args){
        byte b = 126;
        System.out.println("Byte: " + b);
        if (b < Byte.MAX_VALUE){
            b++;
        }
        System.out.println("Byte: " + b);
    }
}
