package com.company;

import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        List<Osake> osakkeet = new ArrayList<Osake>();
        char valinta;
        String osake;
        int hinta, vuodet;
        double prosentti;

        do{
            System.out.println("Lisätäänkö uusi osake (k/e)");
            valinta = sc.next().charAt(0);

            if (valinta == 'k'){
                System.out.println("Anna osakkeen nimi :");
                osake = sc.next();
                System.out.println("Anna ostohinta : ");
                hinta = sc.nextInt();
                Osake b = new Osake(osake, hinta);
                osakkeet.add(b);
            }
        }while(valinta == 'k');


        System.out.println("Anna kasvuprosentti : ");
        prosentti = sc.nextDouble();
        System.out.println("Anna vuodet : ");
        vuodet = sc.nextInt();

        // Kutsutaan Osake-luokan TulostaArvo metodia, joka kutsuu puolestaan kapseloitua tuottoa laskevaa metodia
        for(Osake b : osakkeet){
            b.TulostaArvo(prosentti, vuodet);
        }
        System.out.println(" ");

        // Kaikkien osakeostojen tuotot (eriteltyinä ja lopuksi yht)
        double yht = 0;
        for(Osake b : osakkeet){
            double pr = prosentti/100+1;
            double v = vuodet;
            double kasvu = Math.pow(pr, v);
            //System.out.println(kasvu);
            double lp = (kasvu * b.getoHinta())-b.getoHinta();
            System.out.println("Sijoituksen " + b.getNimi() + " tuotto oli : " + df.format(lp));
            yht = yht + lp;
        }
        System.out.println("\nOsakkeiden yhteistuotto : " + df.format(yht));

    }
}
