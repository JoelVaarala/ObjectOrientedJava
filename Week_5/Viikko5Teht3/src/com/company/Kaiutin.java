package com.company;

public class Kaiutin implements ITelephoneSpeaker {


    private int volume;

    public Kaiutin() {
    }

    public Kaiutin(int volume) {
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
        return "Kaiutin{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean mute() {
        System.out.println("Kautin hiljennetty");
        return false;
    }

    @Override
    public boolean unMute() {
        System.out.println("Kaiutin käytössä");
        return true;
    }
}
