package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;
//4. Napisz metodę, która tablicę int-ów i zwraca int - który jest największy w tej tablicy lub -1 jeli tablica jest pusta
//        Oczekiwane działanie:
//
//        int[] liczby = {2, 3, 5}
//        maxInArray(liczby) = 5;

import java.util.Scanner;

public class PTiM4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wielkosc tablicy zostani wypelniona losowymi liczbamu wypiszemy ktora jest ajwieksza: ");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        wypelnienieTab(n, tab);
        if(n == 0 ) {
            System.out.println("Tablica jest pusta.");
            System. exit(n);
        }
    }

    static void wypelnienieTab(int n, int[] tab) {
        int najwiekszaLiczba = tab[0];
        for (int i = 0; i < n; i++) {
            int max = 101, min = 1;
            int rand = (int) (Math.random() * max) + min;
            tab[i] = rand;
            System.out.print(tab[i] + " | ");
            if (tab[i] > najwiekszaLiczba) {
                najwiekszaLiczba = tab[i];
            }
        }
        System.out.println();
        System.out.println("Najwieksza Liczba to: " + najwiekszaLiczba);
    }
}
