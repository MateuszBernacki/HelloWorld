package com.company.JavaPodstawy.NowyTrenerDzien1;
//Napisz program służący do rozwiązywania równania kwadratowego. Program
//        powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b,
//        c) i wyliczyć pierwiastki x1, x2 równania . Jeśli delta ∆ wyjdzie
//        ujemna, wypisz „Delta ujemna” i  zakończ program.


import java.util.Scanner;

public class Zadanie3 {
    private static int a, b, c;
    private static double delta;
    public static void main(String[] args) {
        pobieranieDanych();
        delta();
        x1();
        x2();

        System.out.println("Delta wynosi: " + delta());
        if (delta() <= 0) {
            System.out.println("Delta ujemna");
        } else if (delta() > 0) {
            System.out.println("Delta wieksza od zera: x1 = " + x1() + " x2 = " + x2());
        }
    }

    private static double x2() {
        return (- b + Math.sqrt(delta()))/2*a;}

    private static double x1() {
        return (- b - Math.sqrt(delta()))/2*a;}

    private static double delta() {
        return Math.pow(b,2) - 4*(a*c);}

    private static void pobieranieDanych() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita a: ");
        a = scanner.nextInt();
        System.out.println("Podaj liczbe całkowita b: ");
        b = scanner.nextInt();
        System.out.println("Podaj liczbe całkowita c: ");
        c = scanner.nextInt();
    }
}
