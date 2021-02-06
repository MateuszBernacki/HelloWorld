package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;

public class Petla4dwa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj poczatek zakresu: ");
        int poczatekZakresu1 = scanner.nextInt();

        System.out.println("Podaj koniec zakresu: ");
        int koniecZakresu1 = scanner.nextInt();

        if (poczatekZakresu1 < koniecZakresu1) {
            System.out.println("Zakres od " + poczatekZakresu1 + " do " + koniecZakresu1);
        } else if (poczatekZakresu1 > koniecZakresu1) {
            System.out.println("Nieprawidłowy zakres!!");
        }
        System.out.println("Podaj ilość dzielników: ");
        int iloscDzielnikow = scanner.nextInt();

        System.out.println("Podaj dzielniki: ");

        for (int i = 1; i <= iloscDzielnikow ; i++) {
            int dzielnik1 = scanner.nextInt();
            for (int j = i; j <= koniecZakresu1; j++){
                if (j % dzielnik1 == 0) {
                System.out.println(j + " ");
                }
            }
        }
    }
}
