package com.company;

public abstract class JasenBase {

    private String jäsenseura;
    private int vakuutusnumero;

    public JasenBase() {
    }

    public JasenBase(String jäsenseura, int vakuutusnumero) {
        this.jäsenseura = jäsenseura;
        this.vakuutusnumero = vakuutusnumero;
    }

    public String getJäsenseura() {
        return jäsenseura;
    }

    public void setJäsenseura(String jäsenseura) {
        this.jäsenseura = jäsenseura;
    }

    public int getVakuutusnumero() {
        return vakuutusnumero;
    }

    public void setVakuutusnumero(int vakuutusnumero) {
        this.vakuutusnumero = vakuutusnumero;
    }

    @Override
    public String toString() {
        return "JasenBase{" +
                "jäsenseura='" + jäsenseura + '\'' +
                ", vakuutusnumero=" + vakuutusnumero +
                '}';
    }

    public abstract void tulostaJäsenTiedot();
}
