package com.company.Ćwiczenia.zadanie1slajdy;
//
//Utwórz klasę o nazwie Pracownik.
//        Do klasy dodaj następujące pola: imię, nazwisko, wiek, dataZatrudnienia, wynagrodzenie.
//        Utwórz trzy konstruktory, które przyjmują: imię, imię i nazwisko, wszystkie pola.
//        Utwórz metody get i set, a także metody o nazwie pracuje, odpoczywa, które nic nie zwracają.

public class Worker {

    private String name;
    private String surname;
    private int age;
    private int startOfWork;
    private int rewuard;

    public static void work() {
        System.out.println("peon = work, work");
    }
    public static void rest() {
        System.out.println(" peon = dead");
    }


    public Worker(String name) {
        this.name = name;
    }
    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Worker(String name, String surname, int age, int startOfWork, int rewuard) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.startOfWork = startOfWork;
        this.rewuard = rewuard;
    }
    public Worker() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStartOfWork() {
        return startOfWork;
    }
    public void setStartOfWork(int startOfWork) {
        this.startOfWork = startOfWork;
    }
    public int getRewuard() {
        return rewuard;
    }
    public void setRewuard(int rewuard) {
        this.rewuard = rewuard;
    }
}
