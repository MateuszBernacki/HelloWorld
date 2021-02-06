package com.company.PracaDomowa.Dzien2;

public class Petle1 {
    public static void main(String[] args) {
        // a
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("///////////////////////");

        //b
        for (int a = 1000; a <= 1020; a++) {
            System.out.println(a);
        }
        System.out.println("///////////////////////");

        //c
        int b = -30;
        while (b <= 1000) {
            if (b % 5 == 0) {
                System.out.println(b);
            }
            b++;
        }
        System.out.println("///////////////////////");

        //d
        for(int c = 1; c <= 100; c++){
            if(c % 3 ==0) System.out.println(c);
        }
        System.out.println();
        System.out.println("/////////////////////////");
        //e
        for(int d = 30; d <= 300; d++) {
            if (d % 5 == 0 && d % 3 == 0) System.out.println(d);
        }
        System.out.println("///////////////////////");
        //f
        int e = -300;
        while(e<=300){
            if(e % 2 == 0) System.out.println(e);
            e++;
        }
        //g
        System.out.println("///////////////////");
        int f = -100;
        while(f<=100){
            if(f % 2 == 1 ) System.out.print(f +"'");
            f++;
        }
        System.out.println();
        //h
        char g = 97;
        while(g<= 122){
            System.out.print(g+"'");
            g++;
        }
        System.out.println();
        //i
        for(char h = 65; h <= 90; h++){
            System.out.print(h+"'");
        }
        System.out.println();
        System.out.println("//////////////////");
        // j
        char j = 97;
        while (j<= 122){
            if(j % 2 == 0 & j % 5 ==0) System.out.print(j + "'");
            j++;
        }
        //k
        System.out.println();
        System.out.println("///////////////////");
        for(int k = 1; k <= 100; k++){
            System.out.print(k + ". Hello World" + " | ");
        }
    }
}
