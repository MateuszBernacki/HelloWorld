package com.company.JavaPodstawy.Dzien6.DoZrozumienia;
//Napisać klase Caretaker (opiekun) która będzie mieć pola
//        - name,
//        - surname,
//        - age
//        - Liste obietow typu Animal - sa to zwierzata w schronisku ktorymi opiekuje sie dana osoba
//        Klasa powinna mieć Konstruktory: pusty, oraz przyjmujacy  imie, nazwisko i wiek. Klasa Caretaker powinna miec metodę
//        registerAnimal która dodaje do listy zwierzat kolejne zwierze, którym danym opiekun ma sie opiekowac oraz !!!! ustawia zwierzeciu danego opieuna.
//        Stworzyć klase Animal ktora ma:
//        id
//        name
//        cageNumber (numer klatki).
//        Caretaker (swojego opiekuna)
//        klasa powinna mieć odpowiedni konstruktor oraz getery i setery.

import java.util.ArrayList;

public class Caretaker {
    private String name;
    private String surname;
    private int wiek;
    private ArrayList<Animal> animals;
    public Caretaker() {
    }
    public Caretaker(String name, String surname, int wiek) {
        this.name = name;
        this.surname = surname;
        this.wiek = wiek;
        animals = new ArrayList<>();
    }
    public void registerAnimal(Animal newAnimal) {
        animals.add(newAnimal);
        newAnimal.setCaretaker(this);
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
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}