package com.company.JavaPodstawy.Dzień5;

//Napisać klase Prostokat, która posiada dwa pola wysokosc oraz szerokość. Stworzyć
//        3 konstruktory: pusty, dwu argumentowy i jednoarguentowy, jednoargumentowy.
//        Napisać dwie metody które obliczają pole prostokąta i obwód.

public class ZadanieProstokat {
    public static void main(String[] args) {

        Prostokat dwaArgumety = new Prostokat();

        Prostokat jedenArgument = new Prostokat();

        Prostokat pusty = new Prostokat();

        int po = dwaArgumety.pole(4, 5);

        int ob = dwaArgumety.obwod(4, 5);

        System.out.println(po + " | " + ob);
    }
}
