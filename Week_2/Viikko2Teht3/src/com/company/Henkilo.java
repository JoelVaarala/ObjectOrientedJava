package com.company;

public class Henkilo {

    private String nimi;
    private int viikkoPisteet;
    private int koePisteet;
    private double arvosana;

    public Henkilo(String nimi){
        this.nimi = nimi;
    }

    public Henkilo(String nimi, int viikkoPisteet, int koePisteet) {
        this.nimi = nimi;
        this.viikkoPisteet = viikkoPisteet;
        this.koePisteet = koePisteet;
    }

    public Henkilo(String nimi, int viikkoPisteet, int koePisteet, double arvosana) {
        this.nimi = nimi;
        this.viikkoPisteet = viikkoPisteet;
        this.koePisteet = koePisteet;
        this.arvosana = arvosana;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getViikkoPisteet() {
        return viikkoPisteet;
    }

    public void setViikkoPisteet(int viikkoPisteet) {
        this.viikkoPisteet = viikkoPisteet;
    }

    public int getKoePisteet() {
        return koePisteet;
    }

    public void setKoePisteet(int koePisteet) {
        this.koePisteet = koePisteet;
    }

    public double getArvosana() {
        return arvosana;
    }

    public void setArvosana(double arvosana) {
        this.arvosana = arvosana;
    }

    @Override
    public String toString() {
        return "Henkilo{" +
                "nimi='" + nimi + '\'' +
                ", viikkoPisteet=" + viikkoPisteet +
                ", koePisteet=" + koePisteet +
                ", arvosana=" + arvosana +
                '}';
    }
}
