package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;
public class Petla7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość liczb: ");

        int ilosc = scanner.nextInt();
        if(ilosc ==0 ){
            System.out.println("nieprawidlowa wartosc");
            return;
        }
        int sum = 0;

        System.out.println("Podaj liczby: ");
        int[] tab = new int[ilosc ];
        int max;
        int min;


        max = min = tab[0];
        for(int i = 0; i <= ilosc - 1; i++) {
            int liczba = scanner.nextInt();
            tab[i] = liczba;

            sum += liczba;


            for (int j = 0; j <= tab.length; j++) {
                if (liczba < min) min = liczba;
                if (liczba > max) max = liczba;
            }
        }
        System.out.println("Ilosc wczytanych liczb: " + ilosc);
        System.out.println("Srednia wprowadzonych liczb to: " + sum / ilosc);

        System.out.println("Najwieksza liczba: " + max + " Najmniejsza Liczba: "+ min+ "srednia arytmetyczna: " + (min + max)/2);
    }
}
