package com.company.JavaPodstawy.Dzien2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        System.out.println(liczba);

        int i=1;
        while(i <liczba){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
