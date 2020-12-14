package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OmatJaYhteisetTilit extends Tili {


    public Saastotili omaTili;
    public SuperSaastoTili yhteinenTili;

    public OmatJaYhteisetTilit(){}

    public OmatJaYhteisetTilit(Saastotili omaTili, SuperSaastoTili yhteinenTili){
        this.omaTili = omaTili;
        this.yhteinenTili = yhteinenTili;
    }

    public Saastotili getOmaTili() {
        return omaTili;
    }

    public void setOmaTili(Saastotili omaTili) {
        this.omaTili = omaTili;
    }

    public SuperSaastoTili getYhteinenTili() {
        return yhteinenTili;
    }

    public void setYhteinenTili(SuperSaastoTili yhteinenTili) {
        this.yhteinenTili = yhteinenTili;
    }

    @Override
    public String toString() {
        return "OmatJaYhteisetTilit{" +
                "omaTili=" + omaTili +
                ", yhteinenTili=" + yhteinenTili +
                '}';
    }


    public void kysyTiedot(){
        Scanner sc = new Scanner(System.in);

        Saastotili oma = new Saastotili();

        System.out.println("\nSyötä oman tilin numero : ");
        oma.setTilinumero(sc.nextLine());

        System.out.println("Syötä omistajan nimi : ");
        oma.setOmistaja(sc.nextLine());

        System.out.println("Syötä saldo : ");
        oma.setSaldoEuroa(sc.nextDouble());
        sc.nextLine();

        System.out.println("Syötä vuotuinen korko % : ");
        oma.setVuosikorkoP(sc.nextDouble());
        sc.nextLine();
        setOmaTili(oma);

        SuperSaastoTili sur = new SuperSaastoTili();

        System.out.println("\nSyötä yhteisen tilin numero : ");
        sur.setTilinumero(sc.nextLine());

        System.out.println("Syötä omistajien nimet : ");
        sur.setOmistaja(sc.nextLine());

        System.out.println("Syötä saldo : ");
        sur.setSaldoEuroa(sc.nextDouble());
        sc.nextLine();

        System.out.println("Syötä vuotuinen korko % : ");
        sur.setVuosikorkoP(sc.nextDouble());
        sc.nextLine();
        setYhteinenTili(sur);

        tulostaTiilinTiedot();
    }

    public double laskeVuosiKorkotuotto(){
        double tuotto1 = omaTili.getSaldoEuroa() * ((100 + omaTili.getVuosikorkoP()) /100) - omaTili.getSaldoEuroa();
        double tuotto2 = yhteinenTili.getSaldoEuroa() * ((100 + yhteinenTili.getVuosikorkoP()) /100) - yhteinenTili.getSaldoEuroa();
        return tuotto1 + tuotto2;
    }

    private static DecimalFormat f = new DecimalFormat("#.##");

    public void tulostaTiilinTiedot(){
        System.out.println(
                "\n" + omaTili.getOmistaja() + ": Omantilin saldo on " + omaTili.getSaldoEuroa() + " €, korkoprosentilla " +
                        omaTili.getVuosikorkoP() + " vuosikorko on " + f.format(omaTili.laskeVuosiKorkotuotto() )+ "€"
        );
        System.out.println(
               "\n" + yhteinenTili.getOmistaja() + ": Yhteisentilin saldo on " + yhteinenTili.getSaldoEuroa() + " €, korkoprosentilla " +
                        yhteinenTili.getVuosikorkoP() + " vuosikorko on " + f.format(yhteinenTili.laskeVuosiKorkotuotto()) + "€"
        );
    }
}
