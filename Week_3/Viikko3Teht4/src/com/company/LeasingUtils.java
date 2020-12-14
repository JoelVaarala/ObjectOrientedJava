package com.company;

import java.util.*;

public class LeasingUtils {

    private ArrayList<LeasingTieto> leasings = new ArrayList<LeasingTieto>();

    public void  KopioTiedot(LeasingTieto lt){

        Scanner sc = new Scanner(System.in);

        Kayttaja kt = new Kayttaja();
        System.out.println("Syötä nimi : ");
        String nimi = sc.nextLine();
        kt.setNimi(nimi);
        System.out.println("Syötä osoite : ");
        String osoite = sc.nextLine();
        kt.setOsoite(osoite);

        Tietokone tk = new Tietokone();
        tk.setMalli(lt.getTietokone().getMalli());
        tk.setMerkki(lt.getTietokone().getMalli());
        System.out.println("Syötä sarjanumero : ");
        String sn = sc.nextLine();
        tk.setSarjanumero(sn);


        LeasingTieto llt = new LeasingTieto(tk, kt, "?" );

        System.out.println("Syötä pvm : ");
        String pvm = sc.nextLine();
        llt.setPvm(pvm);

        System.out.println(llt);
        //System.out.println(leasings.size());
        //System.out.println(Tietokone.copy());
        leasings.add(llt);

        //return new LeasingTieto(tk, kt, "xsxs");

    }

    public void PalautaTiedot(){
        for(LeasingTieto llt: leasings){
            System.out.println("Tiedot:\n" + llt.getKayttaja() + "\n" + llt.getTietokone() + "\n" + llt);
        }
    }

}
