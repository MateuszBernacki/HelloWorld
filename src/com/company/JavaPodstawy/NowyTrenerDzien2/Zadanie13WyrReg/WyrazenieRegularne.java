package com.company.JavaPodstawy.NowyTrenerDzien2.Zadanie13WyrReg;

//Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu
//        String), a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po
//        dwa razy.
//        Przykładowo, dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest
//        mój mój test test”.


import java.util.Scanner;

public class WyrazenieRegularne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String originalString = scanner.nextLine();
        String[] words = originalString.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " " + words[i] + " ");
        }
    }
}
