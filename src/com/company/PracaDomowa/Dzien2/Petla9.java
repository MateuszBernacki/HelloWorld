package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;

public class Petla9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 101, min = 1;
        int rand = (int)(Math.random() * max) + min;


        System.out.println(rand);

        System.out.println("wprowadz liczbe");
        for(int wygrana = 1; ; wygrana++ ){
            int liczba = scanner.nextInt();
            if(liczba == rand) {
                System.out.println("Brawo koniec.");
                break;
            }
            else if(liczba < rand) {
                System.out.println("Więcej dodaj");
            }
            else  {
                System.out.println("Przesadziłeś odejmij trochę");
            }
    }
}}
