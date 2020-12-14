package com.company;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    List<Double> numbers = new ArrayList<Double>();

    public MathUtils(List<Double> numbers) {
        this.numbers = numbers;
    }

   /* public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    } */


    public static void LaskeYhteen(List<Double> numbers){

        double yht = 0;
        for(double n : numbers){
            yht = yht + n;
        }
        System.out.println("Yhteensä : " + yht);
    }

    public static void SuurinLuku(List<Double> numbers){
        double suurin = 0;
        for(double n : numbers){
            if(n > suurin){
                suurin = n;
            }
        }
        System.out.println("Suurin : " + suurin);
    }

    public static void LaskeKeskiarvo(List<Double> numbers){
        double ka = 0, sum = 0;
        int i = 0;
        for(double n : numbers){
            sum = sum + n;
            i++;
        }
        ka = sum / i;
        System.out.println("Keskiarvo : " + ka);
    }
}
