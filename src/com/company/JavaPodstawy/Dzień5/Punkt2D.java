package com.company.JavaPodstawy.Dzień5;

//Utwórz klasę Punkt2D.
//        Dodaj stosowne pola, konstruktory oraz metody get i set wykorzystując słowo kluczowe this.
//        Do klasy dodaj metodę, która jako parametr przyjmuje INNY punkt, a następnie oblicza długość pomiędzy nimi.
//        Utwórz kilka obiektów, a następnie wypisz poszczególne wartości pól oraz oblicz odległość pomiędzy dwoma punktami.

public class Punkt2D {
     private int y;
     private int x;

     public Punkt2D(){

     }

    public Punkt2D(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int obliczOdleglosc(Punkt2D innyPunkt){
         int odleglosc = ((innyPunkt.x - this.x)*2 + (innyPunkt.y - this.y)*2)/2;
         return odleglosc;
     }
}
