package com.company;

import java.util.*;

public class LeasingTieto {

    Date date = new Date();

    private Tietokone tietokone;
    private Kayttaja kayttaja;
    private String pvm;

    public LeasingTieto() {
    }

    public LeasingTieto(Tietokone tietokone, Kayttaja kayttaja, String pvm) {
        this.tietokone = tietokone;
        this.kayttaja = kayttaja;
        this.pvm = pvm;
    }

    public Tietokone getTietokone() {
        return tietokone;
    }

    public void setTietokone(Tietokone tietokone) {
        this.tietokone = tietokone;
    }

    public Kayttaja getKayttaja() {
        return kayttaja;
    }

    public void setKayttaja(Kayttaja kayttaja) {
        this.kayttaja = kayttaja;
    }

    public String getPvm() {
        return pvm;
    }

    public void setPvm(String pvm) {
        this.pvm = pvm;
    }

    @Override
    public String toString() {
        return "LeasingTieto{" +
                //"date=" + date +
                ", tietokone=" + tietokone +
                ", kayttaja=" + kayttaja +
                ", pvm='" + pvm + '\'' +
                '}';
    }
}
