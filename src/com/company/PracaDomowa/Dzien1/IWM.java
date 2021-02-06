package com.company.PracaDomowa.Dzien1;

import java.util.Scanner;

public class IWM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz imie: ");

        String name = scanner.nextLine();

        System.out.println("Wprowadz wiek: ");

        int age = scanner.nextInt();

        System.out.println("Wprowadz miasto: ");

        String city = scanner.next();

        System.out.print("Wprowadziłeś: "+ name + " " + age + " " + city);




    }
}
