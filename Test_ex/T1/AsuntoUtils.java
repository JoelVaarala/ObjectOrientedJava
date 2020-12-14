package com.company;

import java.util.ArrayList;

public class AsuntoUtils {

    public static void palautaAsujat(String eAsunto, ArrayList<Asukas> asujat){

        for (Asukas a: asujat) {
            if(a.getAsunto().getaNumero().equalsIgnoreCase(eAsunto)){
                System.out.println(
                        a.getEtunimi() + " " + a.getSukunimi()
                );
            }
        }
    }

    public static void keskiIka(ArrayList<Asukas> asujat){

        int iat =0;
        int asLuku = 0;

        for (Asukas a: asujat) {
            iat = iat+  a.getIka();
            asLuku = asLuku+1;
        }
        //System.out.println(iat);
        //System.out.println(asLuku);
        double kIka = iat / asLuku;
        System.out.println("Asukkaiden keski ikä : " + kIka);
    }
}
