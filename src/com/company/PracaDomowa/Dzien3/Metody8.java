package com.company.PracaDomowa.Dzien3;

//8. Napisz metodę, która przayjmuje talicę int-ów
//        i nic nie zwraca za to wypisuje na konsoli te liczby z tablicy którę są większe od 100.
//        Oczekiwane działanie:
//
//        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
//        printGratedThenHundred(liczby)
//
//        Wynik:
//        564
//        7867
//        5456
//        210

public class Metody8 {
    public static void main(String[] args) {
        int[] liczby = {1, 45, 564, 7867, 34, 5456, 210};
        liczbyWiekszeOdStu(liczby);
    }
    static void liczbyWiekszeOdStu (int[] liczby){
        for(int i = 0; i < liczby.length; i++) {
            if(liczby[i] > 100) System.out.println(liczby[i]);
        }
    }
}
