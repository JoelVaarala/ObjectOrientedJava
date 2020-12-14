package com.company;

import java.lang.Math;
import java.text.DecimalFormat;

public class Osake {

    private String nimi;
    private int oHinta;
    private double prosentti;
    private int vuodet;

    public Osake() {
        this("Test", 100, 1, 1);
    }

    public Osake(String nimi, int oHinta) {
        this.nimi = nimi;
        this.oHinta = oHinta;
    }

    public Osake(String nimi, int oHinta, double prosentti, int vuodet) {
        this.nimi = nimi;
        this.oHinta = oHinta;
        this.prosentti = prosentti;
        this.vuodet = vuodet;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getoHinta() {
        return oHinta;
    }

    public void setoHinta(int oHinta) {
        this.oHinta = oHinta;
    }

    public int palautaSijoitus(){
        return oHinta;
    }

    public void TulostaArvo(double prosentti, int vuodet){
            this.prosentti = prosentti;
            this.vuodet = vuodet;
            LaskeTuottoYhdelleVuodelle(oHinta, prosentti, vuodet);
    }

    private void LaskeTuottoYhdelleVuodelle(int oHinta, double prosentti, int vuodet){

        DecimalFormat df = new DecimalFormat("0.00");
        double pr = prosentti/100+1;
        double v = vuodet;
        double kasvu = Math.pow(pr, v);
        //System.out.println(kasvu);
        double lp = kasvu * oHinta;
        System.out.println("Osakkeen " + nimi + " arvo sijoituksen lopussa : " + df.format(lp));

        /*double koronTuotto = oHinta * (prosentti /100)*vuodet;
        double koronKanta = oHinta * (prosentti /100);
        double lp = Math.pow(koronKanta, vuodet);
        double loppuArvo = oHinta + koronTuotto;
        System.out.println("Sijoituksen tuotto on : " + loppuArvo + " " + koronTuotto + " " + lp); */

    }

    @Override
    public String toString() {
        return "Osake{" +
                "nimi='" + nimi + '\'' +
                ", oHinta=" + oHinta +
                '}';
    }
}
