package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Tuote> tuotteet = new ArrayList<Tuote>();

        Tietokone t1 = new Tietokone("Asus", "ER443", "212232", 12, 3);
        Tietokone t2 = new Tietokone("Lenovo", "HH544", "3233", 15, 21);
        Tietokone t3 = new Tietokone("Fujitsu", "3323F", "9888", 2, 5);
        Tietokone t4 = new Tietokone("IBM", "IBM3444", "343", 150, 2);

        // Esimerkkinä tulostetaan listan ensimmäinen olio listasta
        System.out.println("\n" + t1 + "\n");

        tuotteet.add(t1);tuotteet.add(t2);tuotteet.add(t3);tuotteet.add(t4);

        // Tulostetaan listan oliot ja verrataan ensimmäistä oliota aiempaan ja huomataan tuotepaikan muutos
        for(Tuote t: tuotteet){
            // Testinä voi myös poistaa kommennoin alta ja nähdä eron jokaisen tuotteen kohdalla
            //System.out.println(t);
            if(t instanceof Tietokone){
                final Tietokone tk = (Tietokone) t;
                System.out.println(tk.tulostaTiedot());
            }
        }
    }
}
