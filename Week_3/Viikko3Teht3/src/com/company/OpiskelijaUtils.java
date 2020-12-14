package com.company;

import java.util.*;

public class OpiskelijaUtils {


    public static Opiskelija TarkastaTiedot(Opiskelija opiskelija) {

        //System.out.println(opiskelija);

        if(opiskelija.getEtunimi().equals("") || opiskelija.getSukunimi().equals("") || opiskelija.getOpiskelijanro().equals("")
                || opiskelija.getOsoite().getKatu().equals("") || opiskelija.getOsoite().getKaupunki().equals("")) {
            opiskelija.setEtunimi(null);opiskelija.setOpiskelijanro(null);
            opiskelija.setSukunimi(null);opiskelija.setOsoite(null);
            System.out.println("Tiedoissa vikaa");
            return null;
        }
        else {

            boolean b1, b2, b3;
            b1 = Character.isUpperCase(opiskelija.getEtunimi().charAt(0));
            if (b1 == true) {
               //System.out.println("Test1 ok!");
            } else {
                //System.out.println("Virhe1, korjattu automaattisesti");
                opiskelija.setEtunimi(opiskelija.getEtunimi().substring(0, 1).toUpperCase() +
                        opiskelija.getEtunimi().substring(1).toLowerCase());
            }

            b2 = Character.isUpperCase(opiskelija.getSukunimi().charAt(0));
            if (b2 == true) {
                //System.out.println("Test2 ok!");
            } else {
                //System.out.println("virhe2, korjattu automaattisesti");
                opiskelija.setSukunimi(opiskelija.getSukunimi().substring(0, 1).toUpperCase() +
                        opiskelija.getSukunimi().substring(1).toLowerCase());
            }
            b3 = opiskelija.getOpiskelijanro().matches("[0-9]+");
            if (b3 == true) {
                //System.out.println("Test3 ok!");
            } else {
                //System.out.println("Virhe3, korjattu automaattisesti");
                opiskelija.setOpiskelijanro(null);
            }
            System.out.println(opiskelija);
            return opiskelija;
        }
    }
}
