package com.company.PracaDomowa.Dzien4;

public class TabWiel5i6 {
    public static void main(String[] args) {
        stworzTabliceOdLewej(4);
        stworzTabliceOdPrawej(4);
    }

    public static int[][] stworzTabliceOdLewej(int n) {
        int[][] tab = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    tab[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return tab;
    }
    public static int[][] stworzTabliceOdPrawej(int s) {
        int[][] tab = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = s - 1; j >= 0; j--) {
                if (i == j) {
                    tab[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = s - 1; j >= 0; j--) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        return tab;
    }
}

