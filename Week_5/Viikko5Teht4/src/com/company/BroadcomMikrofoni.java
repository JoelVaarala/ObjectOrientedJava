package com.company;

public class BroadcomMikrofoni extends Mikrofoni implements  ITelephoneMic {

    private int volume;

    public BroadcomMikrofoni() {
    }

    public BroadcomMikrofoni(int volume) {
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
        return "BroadcomMikrofoni{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean micOn() {
        if(volume > 100)
        return false;
        else return true;
    }

    @Override
    public boolean micOff() {
        System.out.println("Mikrofoni suljettu");
        return true;
    }
}
