package com.company.PracaDomowa.Dzien4;


public class TabWiel1 {
    public static void main(String[] args) {
        stworzTablice(5);
        stworzIWypiszTablice(4);

    }

/*
    static void stworzTablice(int l1) {
        int[][] tab = new int[l1][l1];
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l1; j++) {
                tab[i][j] = 3;
            }
        }
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l1; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();*/

    public static void stworzIWypiszTablice(int l1) {
        int[][] tab2D = stworzTablice(l1);
        wypiszTablice(tab2D);
    }

    public static int[][] stworzTablice(int l1) {
        int[][] tab2D = new int[l1][l1];
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l1; j++) {
                tab2D[i][j] = 3;
            }
        }
        return tab2D;
    }

    public static void wypiszTablice(int[][] tab2D) {
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D.length; j++) {
                System.out.print(tab2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}