package com.company.Ćwiczenia;

public class stringujemy {
    public static void main(String[] args) {

        String tekst ="Dziś zzajęcia rozpoczęły się o ";
        String godzina= "09:00";

        String wynik = tekst + godzina;

        System.out.println(wynik);

        int iloscZnakow = wynik.length();
        System.out.println(iloscZnakow);

        String czescTekstu = wynik.substring(20);
        System.out.println(czescTekstu + "\n");

        char pierwszyZnak = wynik.charAt(0);
        char ostatniZnak = wynik.charAt(35);

        System.out.println(pierwszyZnak + " || " + ostatniZnak + "\n");


        String wielkieLitery = wynik.toUpperCase();
        System.out.println(wielkieLitery);
    }
}
