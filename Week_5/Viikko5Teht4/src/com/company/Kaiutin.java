package com.company;

public class Kaiutin extends Puhelin implements ITelephoneSpeaker{

    private QualcommKaiutin QK;
    private BroadcomKaiutin BK;
    private int volume;

    public Kaiutin() {
    }

    public Kaiutin (QualcommKaiutin QK){
        this.QK = QK;
    }

    public Kaiutin(BroadcomKaiutin BK){
        this.BK = BK;
    }

    public QualcommKaiutin getQK() {
        return QK;
    }

    public void setQK(QualcommKaiutin QK) {
        this.QK = QK;
    }

    public BroadcomKaiutin getBK() {
        return BK;
    }

    public void setBK(BroadcomKaiutin BK) {
        this.BK = BK;
    }

    @Override
    public String toString() {
        return "Kaiutin{" +
                "QK=" + QK +
                ", BK=" + BK +
                '}';
    }

    @Override
    public boolean mute() {
        return false;
    }

    @Override
    public boolean unMute() {
        return false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
