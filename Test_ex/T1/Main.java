package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asukas> asujat = new ArrayList<>();
        int i = 1;
        String b = "0";
        Scanner sc = new Scanner(System.in);

        do {
            Asukas a1 = new Asukas();
            Asunto as = new Asunto();

            System.out.println("Anna asunnon numero (0 = Lopettaa syötön): ");
            String num = sc.nextLine();
            if(num.equalsIgnoreCase(b)){
                i = 0;

            }else if(num != "0"){
                as.setaNumero(num);

                System.out.println("Anna asujan etunimi: ");
                a1.setEtunimi(sc.nextLine());

                System.out.println("Anna asujan sukunimi: ");
                a1.setSukunimi(sc.nextLine());

                System.out.println("Anna asujan ikä kuluvana vuonna: ");
                a1.setIka(sc.nextInt());
                sc.nextLine();

                a1.setAsunto(as);
                asujat.add(a1);
                System.out.println(a1);
            }

        }while(i != 0);

        System.out.println("\nAsujat: ");
        for (Asukas a: asujat) {
            System.out.println(a.getEtunimi() + " " + a.getSukunimi() + ", Asunto: " + a.getAsunto().getaNumero() + ", Ikä: " + a.getIka());
        }

        // Haetaan asunnon A1 asukkaat
        // Testaus kovakoodattu, mutta tämän voisi myös kysyä käyttäjältä (syöte String muuttujaan ja parametrina eteenpäin)
        String eAsunto = "A1";
        System.out.println("\nAsunnossa A1 asuu : ");
        AsuntoUtils.palautaAsujat(eAsunto, asujat);

        // Asukkaiden yhteenlaskettu kaikkien keski ikä
        System.out.println("\n(Kaikkien)");
        AsuntoUtils.keskiIka(asujat);

    }
}
