package com.company.PracaDomowa.Dzien4;
//11. Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej
//        linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
import java.util.Scanner;

public class TabWMet11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę o podanie liczby: ");
        String n = scanner.nextLine();
        zmianaLiczby(n);
    }

    static void zmianaLiczby( String n) {
        char[] ch = n.toCharArray();
        int len = ch.length;
        for (int i = len -1 ; i >= 0 ; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}
