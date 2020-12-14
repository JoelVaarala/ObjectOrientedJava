package com.company;

public class Tietokone extends Tuote{

    private String merkki;
    private String malli;

    public Tietokone(){
    }

    public Tietokone(final String merkki, final String malli){
        this.merkki = merkki;
        this.malli = malli;
    }

    public Tietokone(final String merkki, final String malli, final String tuotenumero){
        super(tuotenumero);
        this.merkki = merkki;
        this.malli = malli;
    }

    public Tietokone(final String merkki, final String malli, final String tuotenumero, final int tuotepaikka, final int maara){
        super(tuotenumero, tuotepaikka, maara);
        this.merkki = merkki;
        this.malli = malli;
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

    // Korvataan parent-luokan getTuotepaikka -metodi
    @Override
    public int getTuotepaikka(){
        int tuotepaikka = super.getTuotepaikka();

        if(tuotepaikka < 10){
            tuotepaikka += 10;
        }
        else if(tuotepaikka >= 10 && tuotepaikka <= 100){
            tuotepaikka += 30;
        }
        else if(tuotepaikka > 100){
            tuotepaikka += 500;
        }
        return tuotepaikka;
    }

    @Override
    public String tulostaTiedot(){
        // kutsutaan normaalista super-luokkaa, josta getTuotepaikka on nyt korvattu uudella arvolla
        return   "Tietokone{merkki='" +  merkki + "', malli='" + malli + '\''+ super.tulostaTiedot() + "}";
    }

    @Override
    public String toString() {
        return "Tietokone{"  +
                "merkki='" + merkki + '\'' +
                ", malli='" + malli + '\'' +  super.toString() +
                '}';
    }
}

