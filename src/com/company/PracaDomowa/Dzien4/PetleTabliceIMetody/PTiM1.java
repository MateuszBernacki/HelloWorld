package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;

//1. Napisz metodę która przyjmuje tablicę float-ów i zwraca float który jest redniš wszystkich wartoci w tablicy.
//        Oczekiwane działanie:
//
//        float[] liczby = {2.0, 3.0, 5.0}
//        average(liczby) = 3.333333          (2.0 + 3.0 + 5.0)/3 = 3.3333333

public class PTiM1 {
    public static void main(String[] args) {
        float[] tab = {2, 3, 5};
        srednia(tab);
    }

    static void srednia (float[] tab){
        float sum = 0;
        for(int i = 0; i < tab.length; i++){
            sum+= tab[i];
            System.out.println(sum);
        }
        System.out.println("średnia z tablicy floatow: " + sum / tab.length);
    }
}
