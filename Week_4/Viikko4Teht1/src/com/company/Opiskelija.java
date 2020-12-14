package com.company;

public class Opiskelija extends Henkilo{

    private int Opiskelijanumero;
    private String Aloituspaiva;

    public Opiskelija(){
    }

   public Opiskelija(String Nimi, String Osoite, String SyntymaAika, String Aloituspaiva, int Opiskelijanumero){
        super(Nimi, Osoite, SyntymaAika);
        this.Opiskelijanumero = Opiskelijanumero;
        this.Aloituspaiva = Aloituspaiva;
   }

    public int getOpiskelijanumero() {
        return Opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        Opiskelijanumero = opiskelijanumero;
    }

    public String getAloituspaiva() {
        return Aloituspaiva;
    }

    public void setAloituspaiva(String aloituspaiva) {
        Aloituspaiva = aloituspaiva;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Opiskelijanumero=" + Opiskelijanumero +
                ", Aloituspaiva='" + Aloituspaiva + '\'' +
                '}';
    }

    // super avulla voidaan kutsua yliluokan metodia, super.metodinNimi()
    public void tulostaOpiskelija(){
        //super.getHenkilonTiedot();
        // void-tyypin metodi tulostaa henkilon tiedot ja opiskelija-luokan attribuutit
        System.out.println(super.getHenkilonTiedot() + ", " + Opiskelijanumero + ", " + Aloituspaiva);
    }
}
