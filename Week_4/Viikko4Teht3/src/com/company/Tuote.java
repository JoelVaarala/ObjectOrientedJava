package com.company;

public class Tuote {

    private String tuotenumero;
    private int tuotepaikka;
    private int maara;

    public Tuote() {
    }

    public Tuote(final String tuotenumero) {
        this.tuotenumero = tuotenumero;
    }

    public Tuote(final String tuotenumero, final int tuotepaikka, final int maara) {
        this.tuotenumero = tuotenumero;
        this.tuotepaikka = tuotepaikka;
        this.maara = maara;
    }

    public String getTuotenumero() {
        return tuotenumero;
    }

    public void setTuotenumero(String tuotenumero) {
        this.tuotenumero = tuotenumero;
    }

    public int getTuotepaikka() {
        return tuotepaikka;
    }

    public void setTuotepaikka(int tuotepaikka) {
        this.tuotepaikka = tuotepaikka;
    }

    public int getMaara() {
        return maara;
    }

    public void setMaara(int maara) {
        this.maara = maara;
    }

    @Override
    public String toString() {
        return "Tuote{" +
                "tuotenumero='" + tuotenumero + '\'' +
                ", tuotepaikka=" + tuotepaikka +
                ", maara=" + maara +
                '}';
    }
}
