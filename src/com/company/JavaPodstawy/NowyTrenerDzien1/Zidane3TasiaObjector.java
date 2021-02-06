package com.company.JavaPodstawy.NowyTrenerDzien1;

import java.util.Scanner;
class Zidane3TasiaObjector {
    private static double a, b, c;
    public static void loadDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        a = scanner.nextDouble();
        System.out.println("Podaj b");
        b = scanner.nextDouble();
        System.out.println("Podaj c");
        c = scanner.nextDouble();
    }
    public static void wykonajObliczenia() {
        double delta = obliczDelta(a, b, c);
        boolean czykontynoowacoowac = chekDelta(delta);
        if (czykontynoowacoowac) {
            double x1 = obliczx1(delta, a, b);
            double x2 = obliczx2(delta, a, b);
            showResult(x1, x2);
        } else {
            System.out.println("Delta ujemna");
        }
    }
    private static void showResult(double x1, double x2) {
        System.out.println("x1 wynosi " + x1);
        System.out.println("x2 wynosi " + x2);
    }
    private static double obliczDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
    private static double obliczx2(double delta, double a, double b) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    private static double obliczx1(double delta, double a, double b) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    private static boolean chekDelta(double delta) {
        return delta >= 0;
    }
}
class Testing {
    public static void main(String[] args) {
        Zidane3TasiaObjector.loadDate();
        Zidane3TasiaObjector.wykonajObliczenia();
    }
}