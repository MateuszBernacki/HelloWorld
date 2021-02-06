package com.company.JavaPodstawy.NowyTrenerDzien2.Zadanie7;

import java.util.Scanner;

public class liczbaFibonacciego {
    static private int ilosc;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile elementow ciagu fibonacciego znalesc: ");
        ilosc = scanner.nextInt();

        for(int i = 1 ; i <= ilosc; i++){
            System.out.println(fibonacci(i)+" ");
        }
    }

    private static int fibonacci(int i) {
        if (i == 1) return 0;
        if (i == 2) return 1;
        else return fibonacci(i -2) + fibonacci(i -1);
    }
}
