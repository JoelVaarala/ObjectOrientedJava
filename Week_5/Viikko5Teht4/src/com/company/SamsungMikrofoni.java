package com.company;

public class SamsungMikrofoni extends Mikrofoni implements ITelephoneMic  {

    private int volume;

    public SamsungMikrofoni() {
    }

    public SamsungMikrofoni(int volume) {
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
        return "SamsungMikrofoni{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean micOn() {
        if(volume > 60)
        return false;
        else return true;
    }

    @Override
    public boolean micOff() {
        System.out.println("Mikrofoni suljettu");
        return true;
    }
}
