package com.company.PracaDomowa.Dzien3;

//4. Napisz program, który wyświetli na konsoli amerykańską flagę

//* * * * * * ==================================
//        * * * * *  ==================================
//        * * * * * * ==================================
//        * * * * *  ==================================
//        * * * * * * ==================================
//        * * * * *  ==================================
//        * * * * * * ==================================
//        * * * * *  ==================================
//        * * * * * * ==================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================


public class Metody4 {
    public static void main(String[] args) {
        flagaAmerican();
    }

    static void flagaAmerican() {
        for (int h = 1; h <= 5; h++) {
            gwiazdki6();
            System.out.println();
            if (h == 4) break;
            gwiazdki5();
            System.out.println();
        }
        for (int d = 1; d <= 6; d++) {
            pasy();
            System.out.println();
        }
    }

    static void gwiazdki6() {
        for (int i = 1; i <= 6; i++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= 34; j++) {
            System.out.print("=");
        }
    }

    static void gwiazdki5() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= 36; j++) {
            System.out.print("=");
        }
    }

    static void pasy() {
        for (int k = 1; k <= 46; k++) {
            System.out.print("=");
        }
    }
}
