package com.company.PracaDomowa.Dzien3;

//6. Napisać metodę która przyjmuje liczbę całkowitą (int) i zwraca obliczoną silnie tej liczby.
//        Oczekiwane dzialanie
//
//        silnia(3) = 6           (1 * 2 * 3 = 6)
//        silnia(4) = 24			(1 * 2 * 3 * 4 = 24)
//        silnia(5) = 120			(1 * 2 * 3 * 4 *5 = 120)

import java.util.Scanner;

public class Metody6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę dla której mam wyliczyć silnie: ");
        int a = scanner.nextInt();

        if(a > 0) silniaplus(a);
        else if (a < 0) silniaMinus(a);
        else System.out.println("Zero nie jest brane pod uwage.");

    }
    static void silniaplus(int a) {
        int sum = 1;
        for (int i = 1; i < a; i++) {
            sum *= i;
            if (sum > a) break;
            System.out.print(i + " ");
            if (sum < a)
                System.out.print("* ");
            else
                System.out.print(" = ");

        }
        System.out.println(a);
    }
    static void silniaMinus(int a) {
        int sum = 1;
        for (int i = -1; i >= a+1; i--) {
            sum *= i;
            if (sum < a) break;
            System.out.print(i + " ");
            if (sum >a)
                System.out.print("* ");
            else
                System.out.print(" = ");

        }
        System.out.println(a);
    }

}
