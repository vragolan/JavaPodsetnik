package com.primer.java.vezbe.troskoviPoslodavca;

public class Funkcije {
    public static double porez(double plata){
        return plata * 0.10;
    }
    public static double pio(double plata){
        return plata * 0.255;
    }
    public static double zdravstveno(double plata){
        return plata * 0.103;
    }
    public static double nezaposlenost(double plata){
        return plata * 0.0075;
    }

    public static double bezOlaksica(double plata){
        return porez(plata) + pio(plata) + zdravstveno(plata) + nezaposlenost(plata);
    }
    public static double olaksicePrva(double plata){
        return porez(plata)-(porez(plata)*0.7) + zdravstveno(plata) + nezaposlenost(plata);
    }
    public static double olaksiceDruga(double plata){
        return porez(plata)-(porez(plata)*0.65) + pio(plata)-(pio(plata)*0.95) + zdravstveno(plata) + nezaposlenost(plata);
    }
    public static double olaksiceTreca(double plata){
        return porez(plata)-(porez(plata)*0.6) + pio(plata)-(pio(plata)*0.9) + zdravstveno(plata) + nezaposlenost(plata);
    }
}
