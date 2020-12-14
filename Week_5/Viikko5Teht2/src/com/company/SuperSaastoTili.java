package com.company;

import java.text.DecimalFormat;

public class SuperSaastoTili extends Tili{


    public SuperSaastoTili(){}

    public SuperSaastoTili(String Tilinumero, String Omistaja, double SaldoEuroa, double VuosikorkoP){
        super(Tilinumero, Omistaja, SaldoEuroa, VuosikorkoP);
    }

    @Override
    public double getVuosikorkoP(){
        double vuosiKorkoP = super.getVuosikorkoP();

        if(getSaldoEuroa() > 10000)
            return vuosiKorkoP + 3.0;
        else
            return vuosiKorkoP;
    }

    @Override
    public double laskeVuosiKorkotuotto(){

        double superProsentti = getVuosikorkoP();

        if(getSaldoEuroa() > 10000){
            superProsentti += 3.0;
        }

        double tuotto = getSaldoEuroa() * ((100 + superProsentti)/100) - getSaldoEuroa();
        return tuotto;
    }

    private static DecimalFormat f = new DecimalFormat("#.##");

    @Override
    public void tulostaTiilinTiedot(){

        System.out.println(
                getOmistaja() + ": SuperSaastotilin saldo on " + getSaldoEuroa() + " €, korkoprosentilla " +
                        getVuosikorkoP() + " vuosikorko on " + f.format(laskeVuosiKorkotuotto() )+ "€"
        );
    }
}
