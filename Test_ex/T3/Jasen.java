package com.company;

public class Jasen extends JasenBase{

    private String etunimi;
    private String sukunimi;
    private String email;

    public Jasen(){}

    public Jasen(String jäsenseura, int vakuutusnumero, String etunimi, String sukunimi, String email) {
        super(jäsenseura, vakuutusnumero);
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Jasen{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*@Override
    public void tulostaJäsenTiedot() {
        System.out.println("Jasen{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", email='" + email + '\'' +
                super.toString() + '}');
    } */

    @Override
    public void tulostaJäsenTiedot() {
        System.out.println(
                "Jasen: " + etunimi + " " + sukunimi + ", email= " + email + ", vakuutusnumero= " + getVakuutusnumero() + ", Seura = " + getJäsenseura()
        );}


}
