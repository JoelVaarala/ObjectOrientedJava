package com.company;

public class Saastotili extends Tili {

    public Saastotili(String Tilinumero, String Omistaja, double SaldoEuroa, double VuosikorkoP){
        super(Tilinumero, Omistaja, SaldoEuroa, VuosikorkoP);
    }

    @Override
    public double laskeVuosiKorkotuotto(){
        double tuotto = getSaldoEuroa() * ((100 + getVuosikorkoP()) /100) - getSaldoEuroa();
        return tuotto;
    }

    @Override
    public void tulostaTiilinTiedot(){
        System.out.println(
                getOmistaja() + ": Saastotilin saldo on " + getSaldoEuroa() + " €, korkoprosentilla " +
                        getVuosikorkoP() + " vuosikorko on " + laskeVuosiKorkotuotto() + "€"
        );
    }
}
