package com.company;

public class Henkilo {

    // yksityiset attribuutit
    private String Nimi;
    private String Osoite;
    private String SyntymaAika;

    // parametriton konstruktori
    public Henkilo() {
    }

    // paramertrillinen konstruktori
    public Henkilo(String nimi, String osoite, String syntymaAika) {
        Nimi = nimi;
        Osoite = osoite;
        SyntymaAika = syntymaAika;
    }

    // getters & setters
    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String nimi) {
        Nimi = nimi;
    }

    public String getOsoite() {
        return Osoite;
    }

    public void setOsoite(String osoite) {
        Osoite = osoite;
    }

    public String getSyntymaAika() {
        return SyntymaAika;
    }

    public void setSyntymaAika(String syntymaAika) {
        SyntymaAika = syntymaAika;
    }

    // protected metodi on käytössä vain luokan periytyessä (inherit)
    protected String getHenkilonTiedot(){
        String tiedot = getNimi() + ", " + getOsoite() + ", " + getSyntymaAika();
        return tiedot;
    }

    @Override
    public String toString() {
        return "Henkilo{" +
                "Nimi='" + Nimi + '\'' +
                ", Osoite='" + Osoite + '\'' +
                ", SyntymaAika='" + SyntymaAika + '\'' +
                '}';
    }
}
