package com.company.PracaDomowa.Dzien2;
import java.util.Scanner;

public class Petla6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe do jakiej mam wypisać potęgi: ");

        int liczba = scanner.nextInt();
        int num = 1;
        for(int i = 0; i <= liczba;i++) {
            num = num *2;
            if(num >= liczba) break;
            System.out.println(num + " ");

        }
    }
}
