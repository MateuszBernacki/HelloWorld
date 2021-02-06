package com.company.JavaPodstawy.NowyTrenerDzien1;
//Napisz program, który pobierze od użytkownika dodatnią liczbę (typu int) i wypisze
//        wszystkie liczby od 1 do podanej liczby, każda w kolejnej linijce, z następującymi
//        zmianami:
//        ● w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”
//        ● w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”
//        ● jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif paf”

import java.util.Scanner;

public class Zadanie4 {
    private static int a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe dodatnia: ");

        a = scanner.nextInt();

        for(int i = 0; i <= a; i++){

            if(i%3==0 & i%7==0) {
                System.out.print("pif paf");
                System.out.println();
            }else if (i%3 == 0){
                System.out.print("pif");
                System.out.println();
            } else if (i% 7 ==0) {
                System.out.print("paf");
                System.out.println();
            }
            System.out.println();
            System.out.println(i + " ");
        }
    }
}
