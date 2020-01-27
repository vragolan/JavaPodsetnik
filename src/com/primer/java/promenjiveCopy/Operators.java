package com.primer.java.promenjiveCopy;

public class Operators {
    public static void main(String[] args){
        int i1 = 1;
        int i2 = 2;
        System.out.println("i1 je: " + i1);
        System.out.println("i2 je: " + i2);
        i1++;
        i2--;
        System.out.println("i1 je povecano: " + i1);
        System.out.println("i2 je smanjeno: " + i2);

        System.out.println("i1 je isto: " + i1++);
        System.out.println("i2 je isto: " + i2--);
        System.out.println("i1 je nakon: " + i1);
        System.out.println("i2 je nakon: " + i2);
        System.out.println("i1 je pre: " + ++i1);
        System.out.println("i2 je pre: " + --i2);

        i1 +=5;
        i2 -=5;
        System.out.println("i1 je promenjeno: " + i1);
        System.out.println("i2 je promenjeno: " + i2);

        if (i1 == i2) System.out.println("Isti su");

        if (i1 != i2){
            System.out.println("Razliciti su");
        }
        if (i1 < i2){
            System.out.println("i1 je manje");
        }
        if (i1 > i2){
            System.out.println("i1 je vece");
        }
        if(i1 <= i2){
            System.out.println("i1 je manje ili jednako i2");
        }
        if (i1 >= i2){
            System.out.println("i1 je vece ili jednako i2");
        }


    }
}
