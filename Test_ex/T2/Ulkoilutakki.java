package com.company;

public class Ulkoilutakki extends Takki {

    private Takki takki;
    private int vedenpitävyys;
    private int hengittävyys;

    public Ulkoilutakki(Takki takki, int vedenpitävyys, int hengittävyys) {
        this.takki = takki;
        this.vedenpitävyys = vedenpitävyys;
        this.hengittävyys = hengittävyys;
    }

    public Ulkoilutakki(String vari, String koko, int vedenpitävyys, int hengittävyys) {
        super(vari, koko);
        this.vedenpitävyys = vedenpitävyys;
        this.hengittävyys = hengittävyys;
    }

    public int getVedenpitävyys() {
        return vedenpitävyys;
    }

    public void setVedenpitävyys(int vedenpitävyys) {
        if(vedenpitävyys == 1000 || vedenpitävyys == 3000 || vedenpitävyys == 5000|| vedenpitävyys == 10000)
        this.vedenpitävyys = vedenpitävyys;
        else{
            this.vedenpitävyys = 1000;
        }
    }

    public int getHengittävyys() {
        return hengittävyys;
    }

    public void setHengittävyys(int hengittävyys) {
        if(hengittävyys < 5001 && hengittävyys >= 0){
        this.hengittävyys = hengittävyys;}
        else{this.hengittävyys = 0;}
    }

    @Override
    public String toString() {
        return "Ulkoilutakki{" +
                "vedenpitävyys=" + vedenpitävyys +
                ", hengittävyys=" + hengittävyys +
                ", vari='" + vari + '\'' +
                ", koko='" + koko + '\'' +
                '}';
    }

    public void tulostaTiedot(){
        System.out.println(
                "Takki " + "koko=" + super.koko + ", vari=" + super.vari +
                        "\n\tUlkoilutakki vedenpitävyys=" + vedenpitävyys + ", hengittävyys=" + hengittävyys + "."
        );
    }
}
