package com.company.PracaDomowa.Dzien3;

//
//10. Napisz metodę, który przjmuje tablicę liczb (int) i zwraca też tablicę,
//        lizcb która jest odwróconą talicę tej która przyszła jako argumenty
//        Oczekiwane działanie:
//
//        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
//        reverseTable(liczby) = (210, 5456, 34, 7867, 564, 45, 1)

public class Metody10 {
    public static void main(String[] args) {
        int[] tab = {1, 45, 564, 7867, 34, 5456, 210};
        odwracanieTab(tab);
    }

    static void odwracanieTab(int[] tab) {

        for (int j = tab.length - 1; j > 0; j--) {
            System.out.println(tab[j]);
        }
    }
}
