package com.company.JavaPodstawy.NowyTrenerDzien1;

import java.util.Scanner;
public class Zadanie2Trener {
    private static int wzrost;
    private static int waga;
    private static double bmi;
    //    Liczenie BMI według wzoru BMI = masa / wzrost^2
//    Optymalny  zakres  BMI  wynosi  od  18.5  do  24.9,
//    wartości  mniejsze  lub  większe  są wartościami nieoptymalnymi.
//    Program oblicza BMI i podaje czy jest ono optymalne
    public static void main(String[] args) {
        System.out.println("Porgram liczy BMI i sprawdza czy jest optymalne");
        pobranieDanych();
        bmi = policzBMI(wzrost, waga);
        pokazWynik(bmi);
    }
    private static void pokazWynik(double bmi) {
        System.out.printf("Twoje BMI wynosi %3.2f",bmi);
        if ((bmi >= 18.5) && (bmi <= 24.9)) System.out.println(" i jest optymalne.");
        else System.out.println("i nie jest optymalne");
    }
    private static double policzBMI(int wzrost, int waga) {
        return waga/Math.pow(wzrost/100d,2);
    }
    private static void pobranieDanych() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wzrost :");
        wzrost = scanner.nextInt();
        System.out.print("Podaj wagę :");
        waga = scanner.nextInt();
    }
}