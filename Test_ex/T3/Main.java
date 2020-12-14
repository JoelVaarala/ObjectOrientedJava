package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("TurmiolanErä");

        JasenTiedot jasenTiedot = new TurmiolanErä();
        jasenTiedot.getJasenTiedot();

        System.out.println("\nHaminanlahdenMetsästysseura");
        JasenTiedot jasenTiedot1 = new HaminanlahdenMetsästysseura();
        jasenTiedot1.getJasenTiedot();
    }
}
