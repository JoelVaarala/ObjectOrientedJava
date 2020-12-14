package com.company;

public class Asukas {

    private String etunimi;
    private String sukunimi;
    private int ika;
    private Asunto asunto;

    public Asukas() {
    }

    public Asukas(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
    }

    public Asukas(String etunimi, String sukunimi, int ika, Asunto asunto) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
        this.asunto = asunto;
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

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public Asunto getAsunto() {
        return asunto;
    }

    public void setAsunto(Asunto asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "Asukas{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", ika=" + ika +
                ", asunto=" + asunto +
                '}';
    }
}
