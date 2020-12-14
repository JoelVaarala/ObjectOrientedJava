package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä halutun tiedoston nimi : ");
        String tNimi = sc.nextLine();
        String file = "C://temp//" + tNimi + ".txt";

        System.out.println("Mitä tiedostoon kirjoitetaan : ");
        String text = sc.nextLine();

        new Thread(() -> {
            FileUtils.WriteToFIle(file, text);
        }).start();


        Runnable run = new FileUtils(file, text);
        Thread t1 = new Thread(run);
        t1.start();

    }
}
