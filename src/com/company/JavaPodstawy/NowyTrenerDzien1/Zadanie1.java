package com.company.JavaPodstawy.NowyTrenerDzien1;

//Zadanie 1.Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float) i obliczy obwód tego okręgu.
//        Do obliczeń przyjmij najpierw π = 3.14, a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.

import java.util.Scanner;

public class Zadanie1 {

    private static float srednica;
    private static final float PI = 3.14f;

    public static void main(String[] args) {
        System.out.println("Program liczy obwód okregu.");
        srednica = pobierzDane();
        System.out.println("Obwod okręgu o średnicy " + srednica + " wynosi " + obliczSrednice(srednica));
        System.out.printf("Obwod okręgu wynosi %5.3f", obliczSrednice(srednica));

    }

    private static float obliczSrednice(float srednica) {
        return srednica * (float) Math.PI;
    }

    private static float pobierzDane() {
        System.out.print("Podaj średnice okregu: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextFloat();
    }
}
