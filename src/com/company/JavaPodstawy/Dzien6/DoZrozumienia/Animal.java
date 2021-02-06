package com.company.JavaPodstawy.Dzien6.DoZrozumienia;
 //Stworzyć klase Animal ktora ma:
//        id
//        name
//        cageNumber (numer klatki).
//        Caretaker (swojego opiekuna)
//        klasa powinna mieć odpowiedni konstruktor oraz getery i setery.

import com.company.JavaPodstawy.Dzien6.DoZrozumienia.Caretaker;

public class Animal {
    private String name;
    private int id;
    private int cageNumber;
    private Caretaker caretaker;
    public Animal(String name, int id, int cageNumber) {
        this.name = name;
        this.id = id;
        this.cageNumber = cageNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCageNumber() {
        return cageNumber;
    }
    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }
    public Caretaker getCaretaker() {
        return caretaker;
    }
    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

}



