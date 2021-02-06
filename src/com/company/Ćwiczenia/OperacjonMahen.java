package com.company.Ćwiczenia;

public class OperacjonMahen {
    public static void main(String[] args) {
        int i = 50;
        int j = 45;
        double h = 42.22;
        int d;
        d = j + i;
        double l = d + h - i;

        double u = i %= j;

        int z = i * j;

        System.out.print(d + "   " + l + "   " + u + "   " + z);

        System.out.println();
        System.out.println("średnia arytemtyczna z wyniku d, l, u, z: " + (d + l + u +z)/4);


        int a = 5;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);


    }

}
