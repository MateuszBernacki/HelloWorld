package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;

//7. Napisz metodę, która dwie tablice intów  jeli tablice sš różnej długoci to
// metoda zwraca pustš tablicę a jeli tej samej długoci to zwracamy tablicę która jest
//        która zawiera sumy elementów na poszczególnych pozycjach
//        Oczekiwane działanie:
//
//        int[] liczby = {2, 3, 5}
//        int[] liczby2 = {7, 10, 0}
//        sumOfTables(liczby , liczby2 ) = {9, 13, 5}

import java.awt.datatransfer.FlavorListener;

public class PTiM7 {
    public static void main(String[] args) {
        int[] liczby = {2, 3, 5};
        int[] liczby2 = {7, 10, 0};

        dlugoscTablicy(liczby, liczby2);

    }
    static void dlugoscTablicy (int[] liczby, int[] liczby2){
        if(liczby.length == liczby2.length) {
            System.out.println("Tablice sa równe.");
            int sum =0;
            for(int i = 0; i < liczby.length; i++){
                sum = liczby[i] + liczby2[i];
            }
        } else System.out.println("Tablice nie sa rowone.");
    }

}
//    static boolean porowananie (int[] liczby, int[] liczby2){
//        int sum1 = 0, sum2 = 0;
//        for (int i = 0; i < liczby.length & i < liczby2.length; i++) {
//            sum1 += liczby[i];
//            sum2 += liczby2[i];
//            System.out.println(sum1 + " | " + sum2);
//        }
//        return sum1==sum2;