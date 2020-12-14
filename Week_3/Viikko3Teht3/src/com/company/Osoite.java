package com.company;

public class Osoite {

    private String katu = null;
    private int postiNro = 0;
    public String kaupunki = null;

    public Osoite() {
    }

    public Osoite(String katu, int postiNro, String kaupunki) {
        this.katu = katu;
        this.postiNro = postiNro;
        this.kaupunki = kaupunki;
    }

    public String getKatu() {
        return katu;
    }

    public void setKatu(String katu) {
        this.katu = katu;
    }

    public int getPostiNro() {
        return postiNro;
    }

    public void setPostiNro(int postiNro) {
        this.postiNro = postiNro;
    }

    public String getKaupunki() {
        return kaupunki;
    }

    public void setKaupunki(String kaupunki) {
        this.kaupunki = kaupunki;
    }

    @Override
    public String toString() {
        return "Osoite{" +
                "katu='" + katu + '\'' +
                ", postiNro=" + postiNro +
                ", kaupunki='" + kaupunki + '\'' +
                '}';
    }
}
