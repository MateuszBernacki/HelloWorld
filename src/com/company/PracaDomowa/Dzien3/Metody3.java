package com.company.PracaDomowa.Dzien3;

//3. Napisać metodę która przyjmuje jedną liczbę (int)
// i zwraca sume cyr tej liczby.
//        Oczekiwany resultat:
//
//        sumOfDigits(45) = 9    ----> (4 + 5 = 9)
//        sumOfDigits(28) = 10    ----> (2 + 8 = 10)
//        sumOfDigits(11) = 2    ----> (1 + 1 = 2)
import java.util.Scanner;
public class Metody3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Podaj liczbę całkowitą przynajmniej dwucyfrową dodatnią: ");
        int liczba = scanner.nextInt();
        if (liczba < 9){
            System.out.println("Nie prowadzę operacji na liczbach jednocyfrowych i minusowych.");
        }
        System.out.println(sumaLiczb(liczba));
    }
    static int sumaLiczb  (int liczba){
        int sum = 0;
        while(liczba > 0){
            sum += liczba % 10;
            liczba /= 10;

        }
        return sum;
    }
}
