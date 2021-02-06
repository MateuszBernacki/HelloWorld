package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;
//6. Napisz metodę która przyjmuje tablicę int-ów i nic nie zwraca za to wywietla
// na ekranie co drugi element tablicy
//        Oczekiwane działanie
//        int[] liczby = {2, 3, 5, 56, 87, 12, 9, 2}
//        printHalfTable(lizcby)
//
//        >> 3
//        56
//        12
//        2

public class PTiM6 {
    public static void main(String[] args) {
        int[] tab = {2, 3, 5, 56, 87, 12, 9, 2};
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i]);
        }
        System.out.println();
        coDrugiElement(tab);
    }
    static void coDrugiElement(int[] elementy){
        int sum = 1;
        for (int j= 0; j < elementy.length; j++){
            System.out.print(elementy[sum]);
            sum+=2;
            if (sum == 9) break;
          }
        }
}
