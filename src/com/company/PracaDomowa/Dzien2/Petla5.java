package com.company.PracaDomowa.Dzien2;
import java.util.Scanner;

public class Petla5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe A: ");

        int liczbaA = scanner.nextInt();

        System.out.println("Podaj liczbe B: ");
        int liczbaB = scanner.nextInt();

        if(liczbaA < liczbaB) {
            System.out.println("Zakres od " + liczbaA + " do " + liczbaB);
        } else if(liczbaA > liczbaB) {
            System.out.println("Nieprawidłowy zakres!!");
        }
        int suman = 0;
        for (int i = liczbaA; i<= liczbaB; i++){
            suman = suman + i;
        }
        System.out.println("Suma ciągu liczb A = " + liczbaA + " oraz B = " + liczbaB + " wynosi: " + suman);
    }
}
