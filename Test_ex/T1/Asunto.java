package com.company;

public class Asunto extends Asukas{

    private String aNumero;


    public Asunto() {
    }

    public Asunto(String aNumero) {
        this.aNumero = aNumero;
    }

    public String getaNumero() {
        return aNumero;
    }

    public void setaNumero(String aNumero) {
        this.aNumero = aNumero;
    }

    @Override
    public String toString() {
        return "Asunto{" +
                "aNumero='" + aNumero + '\'' +
                '}';
    }
}
