package com.company.PracaDomowa.Dzien2;
import java.util.Arrays;

public class Tabela1 {
    public static void main(String[] args) {

        int[] tab = new int[10];
        int[] odwrotna = new int[tab.length];
        int maximum, minimum;
        maximum = minimum = tab[0];

        double sum =0;
        for(int i = 0; i <= 10 -1; i++) {
            int max = 20;
            int min = -10;
            int rand = (int) (Math.random() * max) + min;

            tab[i] = rand;
            System.out.println("tablica ["+ i + "] = " +tab[i]);
            sum +=tab[i];
            if (rand < minimum) minimum = rand;
            if (rand > maximum) maximum = rand;

            Arrays.sort(tab);
        }
        for(int j = 0; j < tab.length; j++){
            odwrotna[j] = tab[tab.length - 1 - j];
        }


        System.out.println("Max: " +maximum+", Min: "+ minimum);
        System.out.println("średnia arytmetyczna: " + sum / tab.length);
        for(int z = 0; z < odwrotna.length; z++){
            System.out.print(odwrotna[z] + " ");
        }
        System.out.println();
        System.out.print("Sortowanei arrays.sort: " +  Arrays.toString(tab));


    }
}
