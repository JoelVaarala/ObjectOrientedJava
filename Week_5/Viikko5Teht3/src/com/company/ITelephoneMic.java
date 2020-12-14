package com.company;

public interface ITelephoneMic {

    public boolean micOn();
    public boolean micOff();
    public int getVolume();
    public void setVolume(int volume);
}
