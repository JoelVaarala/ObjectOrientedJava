package com.company;

public class Main {

    public static void main(String[] args) {

        // Testi Henkilo-luokalle
        Henkilo h1 = new Henkilo("Matti", "Kalakuja", "1992");
        System.out.println("\n"+h1);

        System.out.println("---------------------");

        // Testi Opiskelija-luokanlle + periytyminen
        Opiskelija o1 = new Opiskelija("Minna", "Lohitie", "1994", "31.2.2019", 33);
        System.out.println(o1);
        o1.tulostaOpiskelija();

        System.out.println("---------------------");

        // Testi Henkilokunta-luokanlle + periytyminen
        Henkilokunta h2 = new Henkilokunta("Masa", "Kuhapolku", "1997", "777", "Kuopio", "Pomo");
        System.out.println(h2);
        h2.tulostaHenkilokunta();
    }
}
