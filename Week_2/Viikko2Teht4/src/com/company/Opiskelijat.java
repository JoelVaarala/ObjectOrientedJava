package com.company;

import java.util.*;

public class Opiskelijat {

    private ArrayList<Opiskelija> opiskelijat = new ArrayList<Opiskelija>();

    public void ui(){
        Scanner in = new Scanner(System.in);
        int valinta = 0;
        while(true){
            System.out.println("\nValitse toiminto");
            System.out.println("1 = lisää opiskelija");
            System.out.println("2 = tulosta kaikki opiskelijat");
            System.out.println("3 = poista opiskelija");
            System.out.println("4 = etsi opiskelijat kaupungeittain");
            System.out.println("0 = lopeta");
            System.out.print("Valinta : ");
            valinta = in.nextInt();

            if(valinta == 0){
                break;
            }
            else if(valinta == 1){
                lisaaOpiskelija();
            }
            else if(valinta == 2){
                printOpiskelijat();
            }
            else if(valinta == 3){
                poistaOpiskelija();
            }
            else if(valinta == 4){
                etsiKaupungeittain();
            }
            else
                continue;
        }
    }

    public void printOpiskelijat(){
        System.out.println("\n\nOpiskelijat : ");
        //int i = 1;
        for(Opiskelija o: opiskelijat){
            System.out.println(o);
        }
    }

    public void poistaOpiskelija(){
        System.out.println("Anna poistettavan opiskelijan nro : ");
        Scanner s = new Scanner(System.in);
        int onro = s.nextInt();
        for(Opiskelija o: opiskelijat){
            if(o.getOpiskelijanro() == onro){
                opiskelijat.remove(o);
                break;
            }
        }
    }

    public void etsiKaupungeittain(){
        System.out.println("Tarkasteltava kaupunki : ");
        Scanner s = new Scanner(System.in);
        String city = s.nextLine();
        for(Opiskelija o: opiskelijat){
            if(o.osoite.getKaupunki().equals(city)){
                System.out.println(o);
            }
        }
    }

    public void lisaaOpiskelija(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nSyötä etunimi : ");
        String etunimi = sc.nextLine();

        System.out.print("Syötä sukunimi : ");
        String sukunimi = sc.nextLine();

        System.out.print("Syötä opiskelija numero : ");
        int opiskelijanro = sc.nextInt();

        System.out.println("Osoite tiedot, ");
        sc.nextLine();

        System.out.print("Syötä katuosoite : ");
        String katu = sc.nextLine();

        System.out.print("Syötä kaupunki : ");
        String kaupunki = sc.nextLine();

        System.out.print("Syötä postinumero : ");
        int postinro = sc.nextInt();

        Osoite osoite = new Osoite(katu, postinro, kaupunki);
        Opiskelija o = new Opiskelija(etunimi, sukunimi, opiskelijanro, osoite);
        opiskelijat.add(o);
    }

}
