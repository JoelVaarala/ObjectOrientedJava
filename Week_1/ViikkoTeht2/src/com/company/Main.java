package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int     korkeus,
                leveys;
        char    merkki,
                fill;

        System.out.print("Anna korkeus:");
        korkeus = input.nextInt();

        System.out.print("Anna leveys:");
        leveys = input.nextInt();

        System.out.print("Anna piirtomerkki:");
        input.nextLine();
        merkki = input.next().charAt(0);

        System.out.print("Täytetäänkö vai ei (k=kyllä, e=ei):");
        fill = input.next().charAt(0);


            if (fill == 'k') {

                for(int i = 1; i <= korkeus; i++) {

                    for (int j = 1; j <= leveys; j++) {
                        System.out.print(merkki);
                    }

                    System.out.print("\n");
                }

            }

            else if (fill == 'e') {

                for (int r = 1; r <= korkeus; r++) {

                    for (int n = 1; n <= leveys; n++) {

                        if (r == 1 || r == korkeus || n == 1 || n == leveys) {
                            System.out.print(merkki);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
