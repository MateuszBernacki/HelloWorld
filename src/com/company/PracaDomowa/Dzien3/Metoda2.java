package com.company.PracaDomowa.Dzien3;

import java.util.Scanner;

public class Metoda2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolna liczbę argumentów: ");
        int arg = scanner.nextInt();

        System.out.println("Wczytaj liczby: ");
        int liczby = 1;

        System.out.println("Suma liczb: " + Mnozenie(liczby, arg));
    }

    public static int Mnozenie(int liczby, int arg) {
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        for (int i = 1; i <= arg; i++) {
            liczby = scanner.nextInt();

            sum *= liczby;
        }
        return sum;
    }
}
