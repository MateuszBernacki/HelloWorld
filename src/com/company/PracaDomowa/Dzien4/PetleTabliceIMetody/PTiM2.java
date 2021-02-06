package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;

//2. Napisz metodę, która przyjmuje dwa argumenty, pierwszy to tablica int-ów, drugi to pojedyńczy int. Metoda zwraca true jeli drugi argument
//        znajduje się w  podanej tablicy lub false w przeciwnym przypadku.
//        Oczekiwane działania:
//
//        int[] liczby = {2, 3, 5}
//        doesArrayContainsValue(liczby, 2) = true
//        doesArrayContainsValue(liczby, 9) = false

import java.util.Scanner;

public class PTiM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz swoją losową liczbe do 10: ");
        int l = scanner.nextInt();
        if(l>10) {
            System.out.println("Za duza liczba");
            System. exit(l);
        }
        int[] tab = {1, 2, 5, 8, 9};
        losowanie(l, tab);
    }
    static void losowanie (int l, int[] tab) {
            int sum = 0;
        for (int i = 0; i < tab.length; i++) {

            if (tab[i] == l) {
                sum = sum + 1;
            }
        }
        if(sum == 1) System.out.println("Brawo taka liczba jest w przedziale: " + true);
        if(sum == 0) System.out.println("Niestety takiej liczby nie ma w przdiale: " + false);
    }
}
