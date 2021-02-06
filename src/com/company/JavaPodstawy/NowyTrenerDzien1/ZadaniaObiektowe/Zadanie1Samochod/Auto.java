package com.company.JavaPodstawy.NowyTrenerDzien1.ZadaniaObiektowe.Zadanie1Samochod;

import java.io.FileOutputStream;

public class Auto {
    Silnik silnik;
    Kola kola;
    String nazwa;
    float iloscPalaiwa;
    float iloscTankoweanegoPaliwa;
    float pojemnoscBaku;
    int predkosc;
    final int maxPredkosc;
    boolean autoUruchomione;

    public Auto(Silnik silnik, Kola kola, String nazwa, int maxPredkosc, float iloscPalaiwa, float iloscTankoweanegoPaliwa,
                float pojemnoscBaku) {
        this.silnik = silnik;
        this.kola = kola;
        this.nazwa = nazwa;
        this.iloscPalaiwa = iloscPalaiwa;
        this.iloscTankoweanegoPaliwa = iloscTankoweanegoPaliwa;
        this.pojemnoscBaku = pojemnoscBaku;
        predkosc = 0;
        autoUruchomione = false;
        this.maxPredkosc = maxPredkosc;
    }

    public void uruchom() {
        if (autoUruchomione) System.out.println("Auto " + nazwa + " jest uruchomione");
        else {
            System.out.println("Uruchamiam auto " + nazwa);
            autoUruchomione = true;
        }
    }

    public void zatrzymaj() {
        if (!autoUruchomione) System.out.println("Auto " + nazwa + " jest uruchomione");
        else {
            System.out.println("Uruchamiam auto " + nazwa);
            autoUruchomione = false;

        }
    }

    public void przyspiesz(int ile) {
        if (autoUruchomione) {
            if(predkosc + ile >= maxPredkosc) predkosc = maxPredkosc;
            else predkosc += ile;
        }
        else System.out.println("auto nie jest uruchomione wiec nie może przyspieszyć");
    }
    public void zwolnij(int ile) {
        if (autoUruchomione) {
            if(predkosc - ile < 0) predkosc = 0;
            else predkosc-=ile;
        }
        else System.out.println("auto nie jest uruchomione wiec nie może zwolnić");
    }
}
