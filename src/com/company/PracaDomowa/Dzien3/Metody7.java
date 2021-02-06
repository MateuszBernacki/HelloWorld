package com.company.PracaDomowa.Dzien3;
//7. Napisz metodę która przyjmuje liczbę całkowitą (int), która będzie oznaczać liczbę sekund.
//        Metoda ma zwracać string który będzie wskazywał ile to jest godzin minut i sekund.
//        Oczekiwany resultat:
//
//        calculateSecondsToTime(86399) = "23:59:59"          (bo 86399 sekund to 23 godziny, 59 minut i 59 sekund)

import java.time.LocalTime;
import java.util.Scanner;


public class Metody7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund przeliczymy ja na konkretną godzine: ");
        int n = scanner.nextInt();
        if(n > 86399) System.out.println("Taka godzina nie istnieje.");
        calculateSecondsToTime(n);
    }

    static void calculateSecondsToTime( int n){

        LocalTime czasDnia = LocalTime.ofSecondOfDay(n);
        String godzina = czasDnia.toString();
        System.out.println(godzina);
    }
}
