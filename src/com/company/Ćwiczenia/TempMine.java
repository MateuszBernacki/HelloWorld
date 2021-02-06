package com.company.Ćwiczenia;

import java.util.Scanner;


public class TempMine {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
               System.out.println("Podaj, jaką masz temperaturę: ");
       double temperature = input.nextDouble();

       if (temperature < 36) {
           System.out.println("jesteś osłabiony");
       } else if (temperature < 37) {
           System.out.println("temperatura w normie");
       } else if (temperature < 38) {
            System.out.println("Gorączka");
       } else {
           System.out.println("covid do szppitala");
       }
    }
 }
