package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;

public class Petla4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj poczatek zakresu: ");
        int poczatekZakresu = scanner.nextInt();

        System.out.println("Podaj koniec zakresu: ");
        int koniecZakresu = scanner.nextInt();

        System.out.println("Podaj dzielnik:");
        int dzielnik = scanner.nextInt();

        if(poczatekZakresu < koniecZakresu) {
            System.out.println("Zakres od " + poczatekZakresu + " do " + koniecZakresu);
        } else if(poczatekZakresu > koniecZakresu) {
            System.out.println("Nieprawidłowy zakres!!");
        }

        for(int i = poczatekZakresu; i <= koniecZakresu; i++){
            if(i % dzielnik == 0)
                System.out.println("Liczby podzielne przez dzielnik: " + i);
        }
    }
}
