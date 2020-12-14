package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Kayttaja kt = new Kayttaja();
        System.out.println("Syötä nimi : ");
        String nimi = sc.nextLine();
        kt.setNimi(nimi);
        System.out.println("Syötä osoite : ");
        String osoite = sc.nextLine();
        kt.setOsoite(osoite);

        Tietokone tk = new Tietokone();
        System.out.println("Syötä merkki : ");
        String merkki = sc.nextLine();
        tk.setMerkki(merkki);
        System.out.println("Syötä malli : ");
        String malli = sc.nextLine();
        tk.setMalli(malli);
        System.out.println("Syötä sarjanumero : ");
        String sarjanumero = sc.nextLine();
        tk.setSarjanumero(sarjanumero);

        LeasingTieto lt = new LeasingTieto(tk, kt, "test");
        System.out.println("Syötä pvm : ");
        String pvm = sc.nextLine();
        lt.setPvm(pvm);

        System.out.println(lt);

        // Kysytään lisätäänkö uusi
        char v;
        do {

            System.out.println("Lisätäänkö uusi tieto (k/e)? ");
             v = sc.next().charAt(0);

            if (v == 'k') {
                System.out.println("Next : \n");
                LeasingUtils lu = new LeasingUtils();
                lu.KopioTiedot(lt);
                lu.PalautaTiedot();


            } else if (v == 'e') {
                System.out.println("No more entries.\n");
                System.out.println(lt.getKayttaja());
                System.out.println(lt.getTietokone());
                System.out.println();
                //LeasingUtils lu = new LeasingUtils();
                //System.out.println("----" + lu);
                //LeasingUtils.PalautaTiedot();
            } else
                System.out.println(
                        "error, system exploding in 3..2..1"
                );
        }while(v == 'k');
    }
}
