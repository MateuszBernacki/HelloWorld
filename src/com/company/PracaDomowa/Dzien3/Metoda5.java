package com.company.PracaDomowa.Dzien3;

//5. Napisz metodę, który przyjume dwie liczby całkowie, i zwraca true jeśli pierwsza jest większa lub
//        równa od drugiej i false jeśli przeciwnie
//        Oczekiwane działanie
//        isBigger(5, 1) = true;
//        isBigger(6,6) = true;
//        isBigger(3, 9) = false;

import java.util.Scanner;

public class Metoda5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz pierwsza liczbe: ");
            int a = scanner.nextInt();
            System.out.println("Wprowadz druga licbę: ");
            int b = scanner.nextInt();

            prawdaFalsz(a, b);

    }

    static boolean prawdaFalsz(int a, int b) {
        if (a >= b) {
            System.out.println("isBigger(" + a + ", " + b + ") = " + true);
        } else System.out.println("isBigger(" + a + ", " + b + ") = " + false);
        return true;
    }
}
