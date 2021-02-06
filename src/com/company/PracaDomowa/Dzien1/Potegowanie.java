package com.company.PracaDomowa.Dzien1;
import java.util.Scanner;

public class Potegowanie {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Wprowadz liczbę: ");

        int l = number.nextInt();

        System.out.println("Podaj potęgę: ");

        int p = number.nextInt();

        int potegowanie = (int)Math.pow(l, p);

        System.out.println("Liczba " + l + " została podniesiona do " + p + " potęgi wynosi: " + potegowanie);

    }
}
