package com.company.JavaPodstawy.NowyTrenerDzien1.ZadaniaObiektowe.Zadanie1Samochod;

public class Silnik {
    String typ;
    int moc;

    public Silnik(String typ, int moc) {
        this.typ = typ;
        this.moc = moc;
    }

    @Override
    public String toString() {
        return "Silnik{" +
                "typ='" + typ + '\'' +
                ", moc=" + moc +
                '}';
    }
}
