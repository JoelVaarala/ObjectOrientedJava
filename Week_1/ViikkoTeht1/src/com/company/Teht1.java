package com.company;

import java.util.Scanner;

public class Teht1 {

    public static void main(String[] args) {

        String osake;
        double osinkopros;
        int sijoitus;

        Scanner input = new Scanner(System.in);

        System.out.print("Anna osake:");
        osake = input.nextLine();

        System.out.print("Anna osinkopros:");
        osinkopros = input.nextDouble();

        System.out.print("Anna sijoitus:");
        sijoitus = input.nextInt();

        double tuotto = sijoitus * osinkopros / 100;

        System.out.println("Osakkeen " + osake + " tuotto pääomalle " + sijoitus + " on " + tuotto);

    }
}
