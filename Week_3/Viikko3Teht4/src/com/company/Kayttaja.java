package com.company;

public class Kayttaja {

    private String nimi;
    private String osoite;

    public Kayttaja() {
    }

    public Kayttaja(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return "Kayttaja{" +
                "nimi='" + nimi + '\'' +
                ", osoite='" + osoite + '\'' +
                '}';
    }
}
