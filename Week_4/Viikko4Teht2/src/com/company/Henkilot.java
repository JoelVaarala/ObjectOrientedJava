package com.company;

import java.util.*;


public class Henkilot extends Henkilo {

    private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

    public void ui() {
        Scanner in = new Scanner(System.in);
        char valinta = 'k';

        while (valinta == 'k') {
            System.out.println("Syötetäänkö uuden henkilön tiedot (k/e)");
             valinta = in.next().charAt(0);

            // Jos käyttäjä haluaa lisätä henkilön
            if (valinta == 'k') {

                System.out.println("Onko lisättävä henkilö:\n 1 = Opiskelija \n 2 = Henkilökuntaa");
                int tyyppi = in.nextInt();

                // Jos lisättävä henkilö on opiskelija
                if (tyyppi == 1) {

                    System.out.println("lisätään opiskelija");
                    Opiskelija i = new Opiskelija();
                    i.kysyTiedot();
                    henkilot.add(i);
                }
                // Jos lisättävä henkilö on henkilökuntaa
                else if (tyyppi == 2) {

                    System.out.println("lisätään henkilökuntaa");
                    Henkilokunta i = new Henkilokunta();
                    i.kysyTiedot();
                    henkilot.add(i);
                }
            } else if (valinta == 'e') {

                // tulosta listasta ensin opiskelijat ja sitten henkilökunta
                // käytä instanceof -operaattoria
                System.out.println("\nOpiskelijat : \n");

                for(Henkilo i: henkilot){
                    if(i instanceof Opiskelija){
                        final Opiskelija op = (Opiskelija)i;
                        System.out.println(op.tulostaTiedot());
                    }
                }

                System.out.println("\nHenkilokunta : \n");

                for(Henkilo i: henkilot){
                    if(i instanceof Henkilokunta){
                        final Henkilokunta hk = (Henkilokunta) i;
                        System.out.println(hk.tulostaTiedot());
                    }
                }

                break;

            } else {
                System.out.println("Jotain meni pieleen");
            }

        }
    }
}
