package com.company;

public class BroadcomKaiutin  extends Kaiutin implements ITelephoneSpeaker {

    private int volume;

    public BroadcomKaiutin() {
    }

    public BroadcomKaiutin(int volume) {
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
        return "BroadcomKaiutin{" +
                "volume=" + volume +
                '}';
    }

    @Override
    public boolean mute() {
        System.out.println("Kautin hiljennetty");
        return true;
    }

    @Override
    public boolean unMute() {
        if(volume > 100)
            return false;
        else return true;
    }
}
