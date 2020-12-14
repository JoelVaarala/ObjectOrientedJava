package com.company;

import java.util.*;

public class Auto {

    private String rekisterinumero;
    private String merkki;
    private String malli;
    private int vuosimalli;

    // parametriton konstruktori
    public Auto(){
    }

    // parametrillinen konstruktori
    public Auto(String rekisterinumero, String merkki, String malli, int vuosimalli) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
        this.malli = malli;
        this.vuosimalli = vuosimalli;
    }

    // parametrillinen konstruktori ilman rekkaria (jos ei läpäise ehtoa ja jää "tyhjäksi")
    public Auto(String merkki, String malli, int vuosimalli) {
        this.merkki = merkki;
        this.malli = malli;
        this.vuosimalli = vuosimalli;
    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {

        // tarkastetaan rekkarin max pituudeksi 7 ja sisältävän " - "
        if(rekisterinumero.length() <= 7 && rekisterinumero.contains("-")) {
            this.rekisterinumero = rekisterinumero;
        }
        else{ this.rekisterinumero = " "; }
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {

        // tarkastetaan vuosimallin olevan oikealta aikakaudelta
        if(vuosimalli >= 1900 && vuosimalli <= 2020) {
            this.vuosimalli = vuosimalli;
        }
        else if(vuosimalli < 1900 || vuosimalli > 2020){
            this.vuosimalli = 1900;
        }

    }

    public void kysyTiedot(){

        Scanner sc = new Scanner(System.in);

        //Auto o = new Auto();

        String rekisterinumero, merkki, malli;
        int vuosimalli;

        System.out.print("Anna rekisterinumero : ");
        rekisterinumero = sc.nextLine();
        setRekisterinumero(rekisterinumero);

        System.out.print("Anna merkki: ");
        merkki = sc.nextLine();
        setMerkki(merkki);

        System.out.print("Anna malli: ");
        malli = sc.nextLine();
        setMalli(malli);

        System.out.print("Anna vuosimalli: ");
        vuosimalli = sc.nextInt();
        setVuosimalli(vuosimalli);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rekisterinumero='" + rekisterinumero + '\'' +
                ", merkki='" + merkki + '\'' +
                ", malli='" + malli + '\'' +
                ", vuosimalli=" + vuosimalli +
                '}';
    }
}
