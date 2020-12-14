package com.company;

public class Tietokone {

    private String merkki; // pysyy samana
    private String malli;  // pysyy samana
    private String sarjanumero;

    public Tietokone() {
    }

    public Tietokone(String merkki, String malli, String sarjanumero) {
        this.merkki = merkki;
        this.malli = malli;
        this.sarjanumero = sarjanumero;
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

    public String getSarjanumero() {
        return sarjanumero;
    }

    public void setSarjanumero(String sarjanumero) {
        this.sarjanumero = sarjanumero;
    }

    public Tietokone copy(){
        return new Tietokone(this.merkki, this.malli, "?");
    }

    @Override
    public String toString() {
        return "Tietokone{" +
                "merkki='" + merkki + '\'' +
                ", malli='" + malli + '\'' +
                ", sarjanumero='" + sarjanumero + '\'' +
                '}';
    }
}
