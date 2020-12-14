package com.company;

public class Mikrofoni implements ITelephoneMic {

    private int volume;

    public Mikrofoni() {
    }

    public Mikrofoni(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Mikrofoni{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean micOn() {
        //System.out.println("Mikrofoni käytössä");
        if(volume > 100)
        return false;
        else return true;
    }

    @Override
    public boolean micOff() {
        System.out.println("Mikrofoni suljettu");
        return false;
    }
}
