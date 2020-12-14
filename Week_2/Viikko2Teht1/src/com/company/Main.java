package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // vaihtoehto antamalla tiedot parametreina
        Opiskelija ot = new Opiskelija("Testi-etunimi", "Testi-sukunimi", 12345, "Testi-osoite");
        System.out.println(ot + "\n\n");

        // Syöttämällä omat tiedot
        Scanner sc = new Scanner(System.in);

        String enimi, snimi, osoite;
        int onro;

        System.out.print("Syötä etunimi : ");
        enimi = sc.nextLine();

        System.out.print("Syötä sukunimi : ");
        snimi = sc.nextLine();

        System.out.print("Syötä opiskelijanumero : ");
        onro = sc.nextInt();
        sc.nextLine();

        System.out.print("Syötä osoite : ");
        osoite = sc.nextLine();

        // ilman parametrejä x.setX()
       Opiskelija o =  new Opiskelija();
        o.setEtunimi(enimi);
        o.setSukunimi(snimi);
        o.setOpiskelijanro(onro);
        o.setOsoite(osoite);

       //o.setEtunimi("Joel");
       //o.setSukunimi("Vaarala");
       //o.setOpiskelijanro(1234567);
       //o.setOsoite("Kalastajankuja 11, Vantaa");

        System.out.println("Etunimi : " + o.getEtunimi() + "\nSukunimi : " + o.getSukunimi() +
                            "\nOpiskelijanumero : " + o.getOpiskelijanro() + "\nOsoite : " + o.getOsoite());

    }
}
