package com.company.PracaDomowa.Dzien4;

//12. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
//        Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.

import java.util.Scanner;

public class tabWMet12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj jakieś słowo sprawdzimy czy jest palindromem: ");
        String slowo = scanner.nextLine();


        sprawdzeniePalindrom(slowo);
    }

    static boolean sprawdzeniePalindrom(String slowo) {

        char[] znakiWSlowie = slowo.toCharArray();
        int s1 = 0;
        int s2 = znakiWSlowie.length - 1;

        while (s2 > s1) {
            if (znakiWSlowie[s1] != znakiWSlowie[s2]) {
                System.out.println("Słowo nie jest palindromem.");
                return false;
            }
            ++s1;
            --s2;
        }
        System.out.println("Słowo jest palindromem.");
        return true;
    }

}

