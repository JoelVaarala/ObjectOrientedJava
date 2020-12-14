package com.company;

import java.util.Scanner;

public class Opiskelija extends Henkilo{

    private int Opiskelijanumero;
    private String Aloituspaiva;

    public Opiskelija(){
    }

    public Opiskelija(String Nimi, String Osoite, String SyntymaAika, String Aloituspaiva, int Opiskelijanumero){
        super(Nimi, Osoite, SyntymaAika);
        this.Opiskelijanumero = Opiskelijanumero;
        this.Aloituspaiva = Aloituspaiva;
    }

    public int getOpiskelijanumero() {
        return Opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        Opiskelijanumero = opiskelijanumero;
    }

    public String getAloituspaiva() {
        return Aloituspaiva;
    }

    public void setAloituspaiva(String aloituspaiva) {
        Aloituspaiva = aloituspaiva;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Opiskelijanumero=" + Opiskelijanumero +
                ", Aloituspaiva='" + Aloituspaiva + '\'' +
                '}';
    }

    // super avulla voidaan kutsua yliluokan metodia, super.metodinNimi()
    @Override
    public String tulostaTiedot(){
        //super.getHenkilonTiedot();
        // void-tyypin metodi tulostaa henkilon tiedot ja opiskelija-luokan attribuutit
        return super.tulostaTiedot() + ", " + Opiskelijanumero + ", " + Aloituspaiva;
    }

    @Override
    public void kysyTiedot(){
        super.kysyTiedot();
        Scanner in = new Scanner(System.in);
        System.out.println("Syötä opiskelijanumero: ");
        this.Opiskelijanumero = in.nextInt();
        in.nextLine();
        System.out.println("Syötä aloituspäivä: ");
        this.Aloituspaiva = in.nextLine();
    }
}
