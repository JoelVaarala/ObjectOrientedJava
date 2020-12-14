package com.company;

public class Opiskelija {

    private String etunimi = null;
    private String sukunimi = null;
    private String opiskelijanro = null;
    public Osoite osoite;

    public Opiskelija() {
        this(null, null, null, null);
    }

    public Opiskelija(String etunimi, String sukunimi, String opiskelijanro, Osoite osoite) {
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

    public String getOpiskelijanro() {
        return opiskelijanro;
    }

    public void setOpiskelijanro(String opiskelijanro) {
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
