package com.company;

public class Mikrofoni extends Puhelin implements ITelephoneMic{

    private BroadcomMikrofoni BM;
    private SamsungMikrofoni SM;
    private int volume;

    public Mikrofoni() {
    }

    public Mikrofoni(BroadcomMikrofoni BM){
        this.BM = BM;
    }

    public Mikrofoni(SamsungMikrofoni SM){
        this.SM = SM;
    }

    public BroadcomMikrofoni getBM() {
        return BM;
    }

    public void setBM(BroadcomMikrofoni BM) {
        this.BM = BM;
    }

    public SamsungMikrofoni getSM() {
        return SM;
    }

    public void setSM(SamsungMikrofoni SM) {
        this.SM = SM;
    }

    @Override
    public String toString() {
        return "Mikrofoni{" +
                "BM=" + BM +
                ", SM=" + SM +
                '}';
    }

    @Override
    public boolean micOn() {
        return false;
    }

    @Override
    public boolean micOff() {
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
