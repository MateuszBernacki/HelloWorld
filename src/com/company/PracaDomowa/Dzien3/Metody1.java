package com.company.PracaDomowa.Dzien3;
//1. Napisać metodę która policzy potege danej liczby całkowitej. Tj. przyjmuje
//        dwa argumenty typu int i zwraca typ long. Nie używać gotowych funkcji w javie.
//        Wywołać stworząną funkcje kilka razy w metodzie main każdy wynik działania wypisać na konsole.
//        Oczekiwane działanie:
//
//        pow(3, 2) = 9             (3 do potęgi drugiej)
//        pow(2, 3) = 8             (2 do potęgi 3)
import java.util.Scanner;

public class Metody1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz liczbe: ");
        int liczba = scanner.nextInt();

        System.out.println("Wprowadz potege");
        int potega = scanner.nextInt();

        long WynikPotegowania = Potegowanie(liczba, potega);

        System.out.println(WynikPotegowania);
    }

    public static int Potegowanie(int a, int n) {

        int potega = 1;

        while (n > 0) {
            potega *= a;
            n--;
        }
        return potega;
    }
}
