package com.company;

import java.util.Scanner;

public class Henkilo {

    // yksityiset attribuutit
    private String Nimi;
    private String Osoite;
    private String SyntymaAika;

    // parametriton konstruktori
    public Henkilo() {
    }

    // paramertrillinen konstruktori
    public Henkilo(String nimi, String osoite, String syntymaAika) {
        this.Nimi = nimi;
        this.Osoite = osoite;
        this.SyntymaAika = syntymaAika;
    }

    // getters & setters
    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String nimi) {
        Nimi = nimi;
    }

    public String getOsoite() {
        return Osoite;
    }

    public void setOsoite(String osoite) {
        Osoite = osoite;
    }

    public String getSyntymaAika() {
        return SyntymaAika;
    }

    public void setSyntymaAika(String syntymaAika) {
        SyntymaAika = syntymaAika;
    }

    // protected metodi on käytössä vain luokan periytyessä (inherit)
    protected String tulostaTiedot(){
        String tiedot = getNimi() + ", " + getOsoite() + ", " + getSyntymaAika();
        return tiedot;
    }

    public void kysyTiedot(){

        Scanner in = new Scanner(System.in);

        System.out.println("Syötä nimi: ");
        this.Nimi = in.nextLine();

        System.out.println("Syötä osoite: ");
        this.Osoite = in.nextLine();

        System.out.println("Syötä syntymäaika: ");
        this.SyntymaAika = in.nextLine();
    }

    @Override
    public String toString() {
        return "Henkilo{" +
                "Nimi='" + Nimi + '\'' +
                ", Osoite='" + Osoite + '\'' +
                ", SyntymaAika='" + SyntymaAika + '\'' +
                '}';
    }
}

