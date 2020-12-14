package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Kuinka monta timanttia tulostetaan ? ");
        int maara = sc.nextInt();


        for(int i =1; i<=maara; i++) {
            Runnable tulosta1 = new PrintDiamond();
            Thread saie = new Thread(tulosta1);
            saie.start();
        }
    }
}