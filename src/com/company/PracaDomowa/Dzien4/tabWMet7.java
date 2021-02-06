package com.company.PracaDomowa.Dzien4;

//7. Napisać metodę statyczną (w tej samej klasie co metoda main) która
//        przyjmuje argument w postaci liczby
//        całkowitej 'n' a wypisuje wszystkie liczby pierwsze od 2 do 'n'
//
//        Przykład dla n = 100
//        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
//        Wskazówka, wykorzystać napisaną na zajęciach metodę, która
//        sprawdza czy podana liczba jest pierwsza

import java.util.Scanner;

public class tabWMet7 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe do jakiej mam wyznaczyć liczby pierwsze: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        liczbyPierwsze(n);

    }

    static int liczbyPierwsze(int n) {

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
        return n;
    }
}
