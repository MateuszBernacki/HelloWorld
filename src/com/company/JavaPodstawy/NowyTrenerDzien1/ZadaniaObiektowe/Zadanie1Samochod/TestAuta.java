package com.company.JavaPodstawy.NowyTrenerDzien1.ZadaniaObiektowe.Zadanie1Samochod;

public class TestAuta {
    public static void main(String[] args) {
        Silnik silnikBmw = new Silnik("disel", 500);
        Kola kolaBmw = new Kola("zimowe");
        Auto auto = new Auto(silnikBmw, kolaBmw, "bmw", 250, 0, 0, 60);

        System.out.println("Status auta :"+auto.toString());
        auto.uruchom();
        auto.uruchom();
        System.out.println("Status auta :"+auto.toString());
        auto.przyspiesz(70);
        System.out.println(auto);
        auto.zwolnij(40);
        System.out.println(auto);
    }

    private void testujAuto(Auto auto) {

    }
}
