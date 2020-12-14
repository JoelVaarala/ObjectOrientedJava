package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Takki> takit = new ArrayList<>();

        //Takki takki = new Takki("Sininen", "XS");

        Ulkoilutakki u1 = new Ulkoilutakki("Punainen", "M",  1000, 1000);
        Ulkoilutakki u2 = new Ulkoilutakki("Sininen", "L",  1000, 3000);

        Juhlatakki j1 = new Juhlatakki("Musta", "XL", "Silkki", "x");
        Juhlatakki j2 = new Juhlatakki("Valkoinen","S","Puuvilla","kuvioton");

        takit.add(u1);
        takit.add(u2);
        takit.add(j1);
        takit.add(j2);


        for (Takki t: takit) {
            if(t instanceof Ulkoilutakki){
                final Ulkoilutakki ut = (Ulkoilutakki)t;
                //System.out.println(ut.toString());
                ut.tulostaTiedot();
            }
        }
        for (Takki t: takit) {
            if(t instanceof Juhlatakki){
                final Juhlatakki jt = (Juhlatakki) t;
                //System.out.println(jt.toString());
                jt.tulostaTiedot();
            }
        }

    }
}
