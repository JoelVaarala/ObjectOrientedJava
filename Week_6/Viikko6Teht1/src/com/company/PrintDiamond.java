package com.company;

public class PrintDiamond implements Runnable{


    public PrintDiamond() {
    }


    public void Print() {
        int i=1;
        int j;
        while(i<=4) {
            j=1;
            while(j++<=4-i) {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i=4-1;
        while(i>0) {
            j=1;
            while(j++<=4-i) {
                System.out.print(" ");
            }
            j=1;
            while(j++<=i*2-1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }

        }

    @Override
    public void run() {
        Print();
    }
}
