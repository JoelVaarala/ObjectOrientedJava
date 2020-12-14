package com.company;

public class Main {

    public static void main(String[] args) {

        // luodaan kaksi tietokone-luokan oliota kaikki tiedot täyttäen
        Tietokone t1 = new Tietokone("Asus", "ER443", "212232", 12, 21);
        Tietokone t2 = new Tietokone("Acer", "AR556", "214444", 11, 255);

        // tulostetaan luodut oliot käyttäen toString -metodeja
        System.out.println(t1 +"\n"+ t2);

    }
}
