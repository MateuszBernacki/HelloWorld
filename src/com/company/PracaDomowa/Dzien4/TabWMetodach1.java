package com.company.PracaDomowa.Dzien4;

//1.Napisać metodę statyczną (w tej samej klasie co metoda main) która nie
// przyjmuje żadych argumentów i zwraca void
//        i która wypisuje 20 kolejnych liczb od 0
//        a) za pomocą pętli for
//        b) za pomocą pętli while
//        Oczekiwanych wynik: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20

public class TabWMetodach1 {
    public static void main(String[] args) {
        petlaFor(0);
        System.out.println();
        petlaWhile(0);
    }
    static void petlaFor(int i) {
        for (i=0; i<=20; i++) {
            System.out.print(i + " ");
        }
    }
    static void petlaWhile(int j){
        while (j<= 20){
            System.out.print(j + " ");
            j++;
        }
    }
}
