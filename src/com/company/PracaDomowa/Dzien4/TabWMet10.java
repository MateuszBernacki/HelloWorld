package com.company.PracaDomowa.Dzien4;

//10. Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
import java.util.Scanner;
public class TabWMet10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość tabliczy: ");
        int n = scanner.nextInt();
            tworzenieIWypisanieTablicy(n);

    }
    static void tworzenieIWypisanieTablicy (int n){
        int[] tab = tworzenieTablicy(n);
        wypisanieTablicy(tab);
    }
    static int[] tworzenieTablicy (int n){
            int[] tab = new int[n];

        for(int i = 0; i<n ; i++){
           tab[i]=i;

        }
        return  tab;
    }
    static void wypisanieTablicy (int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " = " + i + " | ");
        }
        System.out.println();
    }
}
