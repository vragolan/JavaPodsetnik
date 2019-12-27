package com.primer.java.promenjive;

import java.math.BigDecimal;

public class Valute {
    public static void main(String[] args){
        double value = .012;
        double psum = value + value + value;
        System.out.println("Double suma: " + psum);

        String strValue = Double.toString(value);
        System.out.println("toString vrednost: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Suma BigDecimal: " + bigSum.toString());
    }
}
