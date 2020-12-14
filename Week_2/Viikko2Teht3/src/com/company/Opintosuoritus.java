package com.company;

import java.util.*;

public class Opintosuoritus {


    private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

    public void ui(){
        Scanner in = new Scanner(System.in);
        int valinta = 0;
        while(true){
            System.out.println("\nValitse toiminto");
            System.out.println("1 = lisää suorite");
            System.out.println("2 = tulosta opintosuoritteet");
            System.out.println("0 = lopeta");
            System.out.print("Valinta : ");
            valinta = in.nextInt();

            if(valinta == 0){
                break;
            }
            else if(valinta == 1){
                lisaaSuorite();
            }
            else if(valinta == 2){
                palautaSuoritukset();
            }
            else
                continue;
        }
    }

    public void palautaSuoritukset(){
        System.out.println("\n\nSuoritteet : \n");
        int i = 1;
        for(Henkilo h: henkilot){
            System.out.println("\nHenkilö " + i + "\nNimi : " + h.getNimi() + "\nVk pisteet : " +
                    h.getViikkoPisteet() + "\nKoe pisteet : " + h.getKoePisteet() + "\nArvosana : " + h.getArvosana());
            i++;
        }
    }


    public double arvoS(int koepisteet, int vkpisteet) {
        int arvosana = 0;
        if (koepisteet<10)
            arvosana = 0;
        else  if(koepisteet<12)
            arvosana = 1;
        else  if(koepisteet<14)
            arvosana = 2;
        else  if(koepisteet<16)
            arvosana = 3;
        else  if(koepisteet<18)
            arvosana = 4;
        else
            arvosana = 5;
        if (arvosana > 0 && ((double) vkpisteet/16) >= 0.75)
            arvosana ++;
        if (arvosana> 5)
            arvosana = 5;

        return arvosana;
    }

    public void lisaaSuorite(){

        Scanner sc = new Scanner(System.in);


        System.out.print("\nSyötä nimi : ");
        String nimi = sc.nextLine();


        System.out.print("Syötä koepisteet (0-16) : ");
        int  koePisteet = sc.nextInt();


        System.out.print("Syötä viikkotehtävien pisteet (0-20) : ");
        int viikkoPisteet  = sc.nextInt();


        // ARVOSANA ???
        double arvosana = arvoS(koePisteet, viikkoPisteet);

        Henkilo h = new Henkilo(nimi, koePisteet, viikkoPisteet, arvosana);

        henkilot.add(h);
    }


}
