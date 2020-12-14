package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random ran = new Random();
        Scanner in = new Scanner(System.in);

        // aloitus rivi
        int[] numerot = new int[7];
        // arvottu rivi
        int[] vastaukset = new int[7];
        // valinta arvotaanko vai ei ( k / e )
        char valinta;

        // täyttää "numerot" -taulun arvotuilla numeroilla 1- 40
        for (int i = 0; i < 7; i++) {
            int nro = ran.nextInt(40) + 1;
            numerot[i] = nro;
        }
        System.out.println("Lottorivi on : " + Arrays.toString(numerot));

        do {
            System.out.print("Haluatko arpoa rivin (k=kyllä, e=ei)? ");
            valinta = in.nextLine().charAt(0);

            if (valinta == 'k') {

                // täyttää "vastaukset" -taulun arvotuilla numeroilla 1- 40
                for (int i = 0; i < 7; i++) {
                    int nr = ran.nextInt(40) + 1;
                    vastaukset[i] = nr;
                }

                System.out.println("Ohjelma arpoi rivin : " + Arrays.toString(vastaukset));

                // käytetään listaa johon laitetaan osumat
                List<Integer> osumat = new ArrayList();

                // for loop hakee aloitus riviltä numeron yksi kerrallaan ja asettaa ne v1 muuttujaan
                for (int i = 0; i < 7; i++) {
                    int v1 = numerot[i];

                    // sisempi for loop tekee saman kuin ensimmäinen,
                    // mutta toimii alaisena joten arvottu rivi käydään läpi kokonaan ennenkuin ylempi silmukka etenee
                    for (int j = 0; j < 7; j++) {
                        int v2 = vastaukset[j];

                        // vertaillaan muuttujia v1 ja v2, jos yhtenäisiä niin lisätään arvo osumat listalle
                        if (v1 == v2) {
                            osumat.add(v1);
                        }
                    }
                }
                // printataan osumien määrä ja niiden numerot
                System.out.println("Oikein oli " + osumat.size() + " kpl, jotka olivat " + osumat);
            } else if (valinta == 'e') {
                System.out.println("Kiitos ja hei hei!");
            }
            // käyttäjältä kysytään uusinta arvontaa, ohjelma loppuu kieltävään vastaukseen
        } while (valinta == 'k');
    }
}