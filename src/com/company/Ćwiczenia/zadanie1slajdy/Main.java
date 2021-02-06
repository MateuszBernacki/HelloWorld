package com.company.Ćwiczenia.zadanie1slajdy;
//Wykorzystując operator new utwórz kilka obiektów klasy Pracownik.
//        Podczas tworzenia obiektów wykorzystaj wszystkie dostępne w klasie konstruktory.
//        Sprawdź w jakiej kolejności należy podawać wartości w konstruktorze




public class Main {
    public static void main(String[] args) {

        Worker w;
        w = new Worker();
        Worker w1 = new Worker();
        Worker w2 = new Worker("Stanislaw");
        Worker w3 = new Worker("Mietek", "Kwietek" );
        Worker w4 = new Worker("Zdzisek", "Koszek",20131939, 20122001, 1800);

        String surname = w3.getSurname();
        w4.work();
        System.out.println(surname);
        w4.setRewuard(2200);
        int rew = w4.getRewuard();
        System.out.println(rew);

    }
}
