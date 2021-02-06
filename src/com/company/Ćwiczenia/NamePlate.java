package com.company.Ćwiczenia;
import java.util.Scanner;


public class NamePlate {
    public static void main(String[] args) {
        Scanner plate = new Scanner(System.in);

        System.out.println("Podaj Imie i nazwisko: ");
        String nameSurname = plate.nextLine();
        System.out.println("Podaj ulicę lub miejscowość wraz z numerem domu: ");
        String street = plate.nextLine();
        System.out.println("Podaj Kod pocztowy oraz miejscowość");
        String posteCode = plate.nextLine();
        System.out.println("Podaj nr. telefonu, jeśli nie posiadasz nacisnij 'Enter': ");
        String telephone = plate.nextLine();


        for(int i = 1; i <=30; i++) {
            if(i >= 1) System.out.print("%");
        }

        System.out.println("\n|");

        System.out.println("|      " + nameSurname);
        System.out.println("|      " + street);
        System.out.println("|      " + posteCode);
        System.out.println("|      " + telephone);

        System.out.println("|");

        for(int i = 1; i <=30; i++) {
            if(i >= 1) System.out.print("%");
        }
    }
}
