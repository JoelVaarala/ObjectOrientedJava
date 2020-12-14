package com.company;

public class Juhlatakki extends Takki {

    private String materiaali;
    private String kuvio;

    public Juhlatakki(String vari, String koko, String materiaali, String kuvio) {
        super(vari, koko);
        this.materiaali = materiaali;
        this.kuvio = kuvio;
    }

    public String getMateriaali() {
        return materiaali;
    }

    public void setMateriaali(String materiaali) {
        this.materiaali = materiaali;
    }

    public String getKuvio() {
        return kuvio;
    }

    public void setKuvio(String kuvio) {
        this.kuvio = kuvio;
    }

    @Override
    public String toString() {
        return "Juhlatakki{" +
                "materiaali='" + materiaali + '\'' +
                ", kuvio='" + kuvio + '\'' +
                ", vari='" + vari + '\'' +
                ", koko='" + koko + '\'' +
                '}';
    }

    public void tulostaTiedot(){
        System.out.println(
                "Takki " + "koko=" + super.koko + ", vari=" + super.vari +
                        "\n\tJuhlatakki materiaali=" + materiaali + ", kuvio=" + kuvio + "."
        );
    }
}
