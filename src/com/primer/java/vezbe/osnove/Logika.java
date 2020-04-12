package com.primer.java.vezbe.osnove;

public class Logika {

    static int cigare = 30;
    static boolean vikend = true;
    static int style1 = 5;
    static int style2 = 10;
    static int temperatura = 50;
    static boolean leto = false;

    public static void main(String[] args){
        cigarParty(cigare, vikend);
        dateFashion(style1,style2);
        squirrelPlay(temperatura,leto);

    }

    //When squirrels get together for a party, they like to have cigars.
    // A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
    // Unless it is the weekend, in which case there is no upper bound on the number of cigars.
    // Return true if the party with the given values is successful, or false otherwise.
    static void cigarParty(int i, boolean b){
        if (i >= 40 && i <= 60)  {
            System.out.println("Zurka.");
        } else if (b == true && i > 40) {
            System.out.println("Zurka.");
        } else {
            System.out.println("No Zurka.");
        }
    }
    //You and your date are trying to get a table at a restaurant.
    // The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
    // The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
    // If either of you is very stylish, 8 or more, then the result is 2 (yes).
    // With the exception that if either of you has style of 2 or less, then the result is 0 (no).
    // Otherwise the result is 1 (maybe).
    static void dateFashion(int i1, int i2){
        if (i1>=8 && i2>=8){
            System.out.println("Rezervacija je moguća.");
        } else if (i1<=2 || i2<=2){
            System.out.println("Rezervacija nije moguća.");
        } else {
            System.out.println("Možda.");
        }

    }
    //The squirrels in Palo Alto spend most of the day playing.
    // In particular, they play if the temperature is between 60 and 90 (inclusive).
    // Unless it is summer, then the upper limit is 100 instead of 90.
    // Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
    static void squirrelPlay(int i, boolean b){
        if (i>=60 && i<=90){
            System.out.println("Ververice se igraju.");
        } else if (i>=100 && b == true) {
            System.out.println("Ververice se igraju.");
        } else {
            System.out.println("Veverice se ne igraju.");
        }
    }





}
