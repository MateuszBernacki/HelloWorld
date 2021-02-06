package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;
//3. Napisz metodę, która przyjmuje dwa argumenty, pierwszy to tablica int-ów, drugi to pojedyńczy int. Metoda zwraca int który jest indeksem wartoci podanej
//        jako argument drugi jeli ten argument istnieje w tablicy lub -1 w przeciwnym przypadku.
//        Oczekiwane działanie:
//
//        int[] liczby = {2, 3, 5}
//        getIndeks(liczby, 2) = 0
//        getIndeks(liczby, 5) = 2
//        getIndeks(liczby, 9) = -1

import java.util.Scanner;
public class PTiM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 0 do 10: ");
        int n = scanner.nextInt();
        if (n > 10) {
            System.out.println("Nie ma takiej liczby w przedziale.");
            System. exit(n);
        }
        int[] tab = {1, 3, 4, 5, 6, 7,};
        sprawdzeneiTab(n, tab);
    }
    static void sprawdzeneiTab( int n, int[] tab) {
        int sum = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == n) {
                System.out.println("Sprawdzenie tablicy (tab, " + n + ") = " + tab[i]);
                sum+=1;
            }
        }
        int j = -1;
        if(sum == 0) System.out.println("Sprawdzenie tablicy (tab, " + n + ") = " + j );
    }
}
