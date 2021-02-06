package com.company.JavaPodstawy.NowyTrenerDzien1;
/*x
delta = b^2 - 4ac
x1 = (-b-pierw(delta))/2a
x2 = (-b+pierw(delta))/2a
Napisz program służący do rozwiązywania równania kwadratowego. Program
powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b,
c) i wyliczyć pierwiastki x1, x2 równania ax2+bx+c=0
Jeśli delta ∆ wyjdzie
ujemna, wypisz „Delta ujemna" i  zakończ program.
 */
import java.util.Scanner;
public class Zadanie3Michalina {
    private static int a;
    private static int b;
    private static int c;
    private static double delta;
    private static double x1;
    private static double x2;
    public static void main(String[] args) {
        System.out.println("Porgram rozwiązuje równania kwadratowe");
        pobranieDanych();
        delta = policzdelta(a,b,c);
        if (delta<0){
            System.out.println("Nie ma rozwiązań");
        } else {
            if (delta == 0) {
                System.out.println("Jedno miejsce zerowe,jedno rozwiązanie " + policzx1(a, b, delta));
            } else {System.out.println("Dwa rozwiązania " + policzx1(a, b, delta)+ policzx2(a, b, delta));
            }
        }
    }
    private static double policzx1(int a,int b,double delta) {
        return (- b - Math.sqrt(delta))/2*a;
    }
    private static double policzx2(int a,int b, double delta ) {
        return (- b + Math.sqrt(delta))/2*a;
    }
    private static double policzdelta(int a,int b, int c) {
        return Math.pow(b,2) - 4*(a*c);
    }
    private static void pobranieDanych() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj a :");
        a = scanner.nextInt();
        System.out.print("Podaj b :");
        b = scanner.nextInt();
        System.out.print("Podaj c :");
        c = scanner.nextInt();
    }
}