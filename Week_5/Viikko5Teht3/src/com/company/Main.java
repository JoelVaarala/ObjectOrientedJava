package com.company;

public class Main {

    public static void main(String[] args) {


        Kaiutin k = new Kaiutin(12);
        System.out.println(k.getVolume());
        System.out.println(k);
        k.mute();

        Mikrofoni m = new Mikrofoni(2);
        System.out.println("\n"+m.getVolume());
        System.out.println(m);
        m.micOn();
        if(m.micOn() != false)
            System.out.println("hahahaha");

        m.micOff();

    }
}
