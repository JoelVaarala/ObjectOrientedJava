package com.company;

public class Main {

    public static void main(String[] args) {

        Saastotili s = new Saastotili("FI332145", "Matti Meikäläinen", 2000, 3.5);
        s.tulostaTiilinTiedot();

        SuperSaastoTili s1 = new SuperSaastoTili("FI338989", "Maija Meikäläinen", 500, 4.5);
        s1.tulostaTiilinTiedot();

        SuperSaastoTili s2 = new SuperSaastoTili("FI334455", "Mikko Meikäläinen", 50000, 4.5);
        s2.tulostaTiilinTiedot();
    }
}
