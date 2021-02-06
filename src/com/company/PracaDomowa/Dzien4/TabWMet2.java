package com.company.PracaDomowa.Dzien4;

//2.Napisać metodę statyczną (w tej samej klasie co metoda main) która nie
// przyjmuje żadych argumentów
//        i zwraca void i która wypisuje kolejnych liczb nieparzystych
//        a) za pomocą pętli for
//        b) za pomocą pętli while

public class TabWMet2 {
    public static void main(String[] args) {
        petlaFor(0);
        System.out.println();
        petlaWhile(0);
    }

    static void petlaFor(int i) {
        for (i = 0; i < 40; i++) {
            if (i % 2 == 0) System.out.print(i + 1 + " ");
        }
    }

    static void petlaWhile(int i) {
        while (i < 40) {
            if (i % 2 == 0) {
                System.out.print(i + 1 + " ");
            }
            i++;
        }
    }
}
