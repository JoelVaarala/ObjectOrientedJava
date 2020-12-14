package com.company;

public class Opiskelija {

    private String etunimi;
    private String sukunimi;
    private int opiskelijanro;
    public Osoite osoite;

    public Opiskelija() {
    }

    public Opiskelija(String etunimi, String sukunimi, int opiskelijanro, Osoite osoite) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanro = opiskelijanro;
        this.osoite = osoite;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getOpiskelijanro() {
        return opiskelijanro;
    }

    public void setOpiskelijanro(int opiskelijanro) {
        this.opiskelijanro = opiskelijanro;
    }

    public Osoite getOsoite() {
        return osoite;
    }

    public void setOsoite(Osoite osoite) {
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return "Opiskelija{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", opiskelijanro=" + opiskelijanro +
                ", osoite=" + osoite +
                '}';
    }

}
