package com.company.PracaDomowa.Dzien2;

import java.util.Scanner;

public class Petle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz ilość powitań liczbowo petla: ");
        int liczba = scanner.nextInt();

        System.out.println("Pętla for");
        for(int i = 1; i <= liczba; i++ ){
            System.out.println(i +". Hello world");
        }
        System.out.println();
        System.out.println("Pętla while");
        int i =1;
        while(i<= liczba) {
            System.out.println(i+". Hello World");
            i++;
        }

    }
}
