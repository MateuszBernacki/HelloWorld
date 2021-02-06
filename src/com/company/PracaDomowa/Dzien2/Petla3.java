package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;

public class Petla3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczby wieksze od zeraw przeciwnym wypadku wpadka: ");

        int i = 0;
        while(true) {
            int liczba = scanner.nextInt();
            if (liczba >= 0) {
                System.out.println("brawo jesteś na plus z " + liczba);
            } else if (liczba < 0) {
                System.out.println(" pomyłka naucz sie liczyć");
            }
        }
    }
}
