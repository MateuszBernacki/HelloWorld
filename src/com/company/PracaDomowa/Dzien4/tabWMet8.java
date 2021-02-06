package com.company.PracaDomowa.Dzien4;
//8. Napisać metodę któa przyjmie liczbę całkowitą n i zwróci liczbe całkowitą która jest równa:
//        (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n)
//        Przykład dla n = 5: 55
//        (1*1 + 2*2 + 3*3 + 4*4 + 5*5 = 55)
import java.util.Scanner;
public class tabWMet8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe którą mam sumować: ");
        int n = scanner.nextInt();
        System.out.println(mnorzenie(n));

    }

    static int mnorzenie(int n) {

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (i * i);
        }
        return sum;
    }

}
