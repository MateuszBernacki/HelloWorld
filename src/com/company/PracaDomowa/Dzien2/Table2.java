package com.company.PracaDomowa.Dzien2;

public class Table2 {
    public static void main(String[] args) {
        int[] tab = new int[20];
        for (int i = 0; i <= 20 - 1; i++) {
            int max = 10;
            int min = 1;
            int rand = (int) (Math.random() * max) + min;
            tab[i] = rand;
            System.out.print(rand + " ");
        }
        System.out.println();

        for (int i = 0; i< 10 +1; i++) {
            int suma = 0;
            for(int j = 0; j< 20; j++){
                if(i == tab[j]) suma++;
            }
            System.out.println(i +" = "+ suma);
        }

    }
}
