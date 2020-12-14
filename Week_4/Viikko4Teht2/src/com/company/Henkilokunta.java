package com.company;

import java.util.Scanner;

public class Henkilokunta extends Henkilo{

    private String Tyontekijanumero;
    private String Toimipaikka;
    private String Titteli;

    public Henkilokunta(){
    }

    public Henkilokunta(String Nimi, String Osoite, String SyntymaAika, String Tyontekijanumero, String Toimipaikka, String Titteli){
        super(Nimi, Osoite, SyntymaAika);
        this.Tyontekijanumero = Tyontekijanumero;
        this.Toimipaikka = Toimipaikka;
        this.Titteli = Titteli;
    }

    public String getTyontekijanumero() {
        return Tyontekijanumero;
    }

    public void setTyontekijanumero(String tyontekijanumero) {
        Tyontekijanumero = tyontekijanumero;
    }

    public String getToimipaikka() {
        return Toimipaikka;
    }

    public void setToimipaikka(String toimipaikka) {
        Toimipaikka = toimipaikka;
    }

    public String getTitteli() {
        return Titteli;
    }

    public void setTitteli(String titteli) {
        Titteli = titteli;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tyontekijanumero='" + Tyontekijanumero + '\'' +
                ", Toimipaikka='" + Toimipaikka + '\'' +
                ", Titteli='" + Titteli + '\'' +
                '}';
    }

    @Override
    public String tulostaTiedot(){
        return super.tulostaTiedot() + ", " + Tyontekijanumero + ", " + Toimipaikka + ", " + Titteli;
    }

    @Override
    public void kysyTiedot(){

        super.kysyTiedot();

        Scanner in = new Scanner(System.in);

        System.out.println("Syötä työntekijänumero: ");
        this.Tyontekijanumero = in.nextLine();

        System.out.println("Syötä toimipaikka: ");
        this.Toimipaikka = in.nextLine();

        System.out.println("Syötä titteli: ");
        this.Titteli = in.nextLine();

    }
}