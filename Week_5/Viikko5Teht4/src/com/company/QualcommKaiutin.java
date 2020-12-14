package com.company;

public class QualcommKaiutin extends Kaiutin implements ITelephoneSpeaker {

    private int volume;

    public QualcommKaiutin() {
    }

    public QualcommKaiutin(int volume) {
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
        return "QualcommKaiutin{" +
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
        if(volume > 80)
            return false;
        else return true;
    }
}
