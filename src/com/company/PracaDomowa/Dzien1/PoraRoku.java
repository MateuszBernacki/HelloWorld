package com.company.PracaDomowa.Dzien1;

import java.util.Scanner;

public class PoraRoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz numer miesiąca: ");

        int miesiac = scanner.nextInt();

        if(miesiac >= 3 & miesiac <= 5) {
            System.out.println("wiosna");
        }
            else if(miesiac >= 6 & miesiac <= 8) {
            System.out.println("lato");
        }
            else if(miesiac >= 9 & miesiac <= 11){
            System.out.println("jesien");
        }
            else if(miesiac == 12 | miesiac == 1 | miesiac == 2){
            System.out.println("zima");
        }
            else if(miesiac <= 0 | miesiac >= 13) {
            System.out.println("Brawo stworzyłeś nowy miesiąc :)");
        }

    }
}
