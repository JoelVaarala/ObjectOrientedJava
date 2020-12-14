package com.company;

public abstract class Tili {

    private String Tilinumero;
    private String Omistaja;
    private double SaldoEuroa;
    private double VuosikorkoP;

    public Tili() {
    }

    public Tili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorkoP) {
        Tilinumero = tilinumero;
        Omistaja = omistaja;
        SaldoEuroa = saldoEuroa;
        VuosikorkoP = vuosikorkoP;
    }

    public String getTilinumero() {
        return Tilinumero;
    }

    public void setTilinumero(String tilinumero) {
        Tilinumero = tilinumero;
    }

    public String getOmistaja() {
        return Omistaja;
    }

    public void setOmistaja(String omistaja) {
        Omistaja = omistaja;
    }

    public double getSaldoEuroa() {
        return SaldoEuroa;
    }

    public void setSaldoEuroa(double saldoEuroa) {
        SaldoEuroa = saldoEuroa;
    }

    public double getVuosikorkoP() {
        return VuosikorkoP;
    }

    public void setVuosikorkoP(double vuosikorkoP) {
        VuosikorkoP = vuosikorkoP;
    }

    public abstract double laskeVuosiKorkotuotto();
    public abstract void tulostaTiilinTiedot();

    @Override
    public String toString() {
        return "Tili{" +
                "Tilinumero='" + Tilinumero + '\'' +
                ", Omistaja='" + Omistaja + '\'' +
                ", SaldoEuroa=" + SaldoEuroa +
                ", VuosikorkoP=" + VuosikorkoP +
                '}';
    }
}
