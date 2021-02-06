package com.company.PracaDomowa.Dzien3;
//9. Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby z
//        tablicy którę są parzyste.
//        Oczekiwane działanie:
//
//        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
//        printOddNumbers(liczby)
//
//        Wynik:
//        564
//        34
//        5456
//        210

public class Metody9 {
    public static void main(String[] args) {
        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
        parzyste(liczby);
    }
    static void parzyste (int[] liczby){
        for (int i = 0; i < liczby.length; i++){
            if(liczby[i] % 2 == 0) System.out.println(liczby[i]);
        }
    }
}
