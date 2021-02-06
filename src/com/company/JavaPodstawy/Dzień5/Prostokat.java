package com.company.JavaPodstawy.Dzień5;
//Napisać klase Prostokat, która posiada dwa pola wysokosc oraz szerokość. Stworzyć
//        3 konstruktory: pusty, dwu argumentowy i jednoarguentowy, jednoargumentowy.
//        Napisać dwie metody które obliczają pole prostokąta i obwód.
public class Prostokat {
    int wysokosc;
    int szerokoszc;

    public Prostokat(){

    }

    public Prostokat(int wys, int szer) {
        wysokosc = wys;
        szerokoszc = szer;
    }

    public Prostokat(int w){
        wysokosc = w;
        szerokoszc = w;
    }
    static int pole ( int wys, int szer){
        return wys * szer;
    }

    static int obwod ( int wys, int szer) {
        return 2 * wys + 2 * szer;
    }

}