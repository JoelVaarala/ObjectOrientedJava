package com.company;

public class Henkilokunta extends Henkilo{

    private String Tyontekijanumero;
    private String Toimipaikka;
    private String Titteli;

    public Henkilokunta(){
    }

    public Henkilokunta(String Nimi, String Osoite, String SyntymaAika, String Tyontekijanumero, String Toimipaikka, String Titteli){
        super(Nimi, Osoite, SyntymaAika);
        this.Tyontekijanumero = Tyontekijanumero;
        this.Toimipaikka = Toimipaikka;
        this.Titteli = Titteli;
    }

    public String getTyontekijanumero() {
        return Tyontekijanumero;
    }

    public void setTyontekijanumero(String tyontekijanumero) {
        Tyontekijanumero = tyontekijanumero;
    }

    public String getToimipaikka() {
        return Toimipaikka;
    }

    public void setToimipaikka(String toimipaikka) {
        Toimipaikka = toimipaikka;
    }

    public String getTitteli() {
        return Titteli;
    }

    public void setTitteli(String titteli) {
        Titteli = titteli;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tyontekijanumero='" + Tyontekijanumero + '\'' +
                ", Toimipaikka='" + Toimipaikka + '\'' +
                ", Titteli='" + Titteli + '\'' +
                '}';
    }

    public void tulostaHenkilokunta(){
        System.out.println(super.getHenkilonTiedot() + ", " + Tyontekijanumero + ", " + Toimipaikka + ", " + Titteli);
    }
}
