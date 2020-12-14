package com.company;

public class Opiskelija {

    private String etunimi;
    private String sukunimi;
    private int opiskelijanro;
    private String osoite;

    public Opiskelija(){
    }

    public Opiskelija(String etunimi, String sukunimi, int opiskelijanro, String osoite){
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

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return "Opiskelija{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", opiskelijanro=" + opiskelijanro +
                ", osoite='" + osoite + '\'' +
                '}';
    }
}
