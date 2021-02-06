package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;

public class Petla8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pobieranie licz całkowitych '0' przerywa pobieranie liczb: ");
        int ilosc = 0;
        int sum = 0;
        int min = 0, max = 0;
        int u = 0;
        for (int i = 1; ; i++) {
            int liczba = scanner.nextInt();
            if (liczba == 0) break;
            sum += liczba;
            ilosc = i;
            u = liczba;

        }

            for (int j = 1; j <= ilosc; j++) {
                if (u < min) min = u;
                if (u > max) max = u;
            }
        System.out.println("średnia arytmetyczna: " + sum / ilosc);
        System.out.println(("najwieksza: " + max + " najmnjejsza: " + min));
        }
}
