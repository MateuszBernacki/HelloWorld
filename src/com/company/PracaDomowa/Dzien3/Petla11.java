package com.company.PracaDomowa.Dzien3;
import java.util.Scanner;

public class Petla11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();


        if (liczba % 2 == 0) {
            System.out.println("dzielnik: " + 2);
        }

        if (liczba % 3 == 0) {
            System.out.println("dzielnik: " + 3);
        }
        if (liczba % 4 == 0) {
            System.out.println("dzielnik: " + 4);
        }
        for (int i = 1; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                System.out.println("dzielnik: " + i);
            }
        }
    }
}
