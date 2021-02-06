package com.company.JavaPodstawy.NowyTrenerDzien1;

//Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w
//        normie. Program powinien wczytywać od użytkownika dwie zmienne: wagę w
//        kilogramach (typ float) oraz wzrost w centymetrach (typ int). BMI powinno zostać
//        wyliczone zgodnie z poniższym wzorem:

//BMI = masa / (wzrost)do kwadratu
//        Optymalny zakres BMI wynosi od 18.5 do 24.9, wartości mniejsze lub większe są
//        wartościami nieoptymalnymi.
//        Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie
//        z powyższymi założeniami.

import java.util.Scanner;

public class Zadanie2 {

    private static float waga;
    private static int wysokosc;

    public static void main(String[] args) {

        System.out.println("Program wyliczajacy BMI.");

        waga = pobierzWage();
        wysokosc = pobierzWzrost();
        wynikBMI();

        System.out.println("Przy wadze " + waga + " oraz wzroście " + wysokosc + " twoje BMI wynosi: " + wynikBMI());

        if(wynikBMI() < 18.5) {
            System.out.println("Twoje BMI jest zbyt niskie.");
        } else  if (wynikBMI() > 18.5 & wynikBMI() < 24.9) {
            System.out.println("Twoje BMI jest optymalne");
        } else if (wynikBMI() > 24.9) System.out.println("Twoje BMI jest zbyt wysokie.");
    }

    private static float wynikBMI() {
        return waga / (float) Math.pow(wysokosc/100d,2);
    }

    private static int pobierzWzrost() {
        System.out.print("Wprowadz wzrost w cm: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static float pobierzWage() {
        System.out.print("Wprowadz wage kg: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
