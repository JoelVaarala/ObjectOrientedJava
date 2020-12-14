package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nSyötä etunimi : ");
        String etunimi = sc.nextLine();

        System.out.print("Syötä sukunimi : ");
        String sukunimi = sc.nextLine();

        System.out.print("Syötä opiskelija numero : ");
        String opiskelijanro = sc.nextLine();

        System.out.println("Osoite tiedot, ");
        //sc.nextLine();

        System.out.print("Syötä katuosoite : ");
        String katu = sc.nextLine();

        System.out.print("Syötä kaupunki : ");
        String kaupunki = sc.nextLine();

        System.out.print("Syötä postinumero : ");
        int postinro = sc.nextInt();

        Osoite osoite = new Osoite(katu, postinro, kaupunki);
        Opiskelija opiskelija = new Opiskelija(etunimi, sukunimi, opiskelijanro, osoite);


        OpiskelijaUtils.TarkastaTiedot(opiskelija);

        //System.out.println(opiskelija);
    }

}
