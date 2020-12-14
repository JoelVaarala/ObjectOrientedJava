package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> tulot = new ArrayList();
        int palkka = 0,
            kierros;

        System.out.println("Anna kuukausikohtaiset tulot.");

        for(kierros = 1; palkka >= 0; kierros++ ){

            System.out.print("Anna " + kierros + ". kuukauden tulo: ");
            palkka = input.nextInt();
            if(palkka > -1)
            tulot.add(palkka);
        }
        //System.out.println(tulot);
        System.out.println(" ");

        // Tulojen yhteis summa
        double summa = 0;
        int suurin= 0;
        for (int i : tulot){
            summa = summa + i;
            if(i > suurin)
                suurin = i;
        }
        System.out.println("Kokonaistulot ovat " + summa);

        // Tulojen keskiarvo
        double ka = summa / kierros;
        System.out.println("Keskiarvoinen kuukausikohtainen tulo on " + ka);

        // Print suurin kk:n tulo
        System.out.println("Suurin kuukausikohtainen tulo on " + suurin);


    }
}
