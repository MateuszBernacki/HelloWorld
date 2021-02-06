package com.company.JavaPodstawy.Dzień5;

import com.company.JavaPodstawy.Dzień5.Punkt2D;

public class MainDzien5 {
    public static void main(String[] args) {

        Punkt2D p1 = new Punkt2D(0, 0);
        Punkt2D p2 = new Punkt2D(3, 4);

            int v = p1.obliczOdleglosc(p2);
        System.out.println(v);

    }
}
