package com.company.JavaPodstawy.Dzien2;

public class Zadanie2 {
    public static void main(String[] args) {
        int number = 100;

/*        while (number <= 100) {
            System.out.print(number);
            number--;

            if (number % 2 > 0) {
                System.out.print(" podzielne przez 2");
            }
            if (number % 3 > 0) {
                System.out.print(" podzielne przez 3");
            }
            if (number % 5 > 0) {
                System.out.print(" podzielna przez 5 ");
            }
            System.out.println();
            if (number == 0) {
                break;*/
        while (number > 0) {
            System.out.print(number);
            number--;

            if (number % 2 > 0) {
                System.out.print(" podzielne przez 2");
            }
            if (number % 3 > 0) {
                System.out.print(" podzielne przez 3");
            }
            if (number % 5 > 0) {
                System.out.print(" podzielna przez 5 ");
            }
            System.out.println();

        }
    }
}
