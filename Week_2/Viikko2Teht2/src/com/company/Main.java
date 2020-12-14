package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Auto a = new Auto("ASD-123","Mord","Fustang",2010);
        Auto b = new Auto();
        b.kysyTiedot();

        //System.out.println(a);
        System.out.println("\nAuto..." + "\nRekisterinumero :\t" + b.getRekisterinumero() + "\nMerkki :\t\t\t" + b.getMerkki() +
                            "\nMalli :\t\t\t\t" + b.getMalli() + "\nVuosimalli :\t\t" + b.getVuosimalli());

    }
}
