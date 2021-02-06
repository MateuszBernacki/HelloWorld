package com.company.JavaPodstawy.Dzien2;

import java.lang.Math;

public class Zadanie1 {
    public static void main(String[] args)
    {

        int max = 50;
        int min = -25;
        int rand = (int)(Math.random() * max) + min;
        System.out.println(rand);

        if (rand >= -25 & rand <= -1){
            System.out.println("Ujemna");
        }
        else if(rand == 0) {
            System.out.println("Zero");
        }
        else if(rand >= 1 & rand <=25) {
            System.out.println("Dodatnia");
        }
    }
}
