package com.company.JavaPodstawy.Dzien6.Notatka;
//Napisz klasę "Note", reprezentującą notatkę z tablicą (lub listą) tagów ("tags")" i datą utworzenia. (użyć obiektu Date)
//        Notaka powinna ponadto mieć swoją zawartość (String noteText)
//        Dodaj metodę "match". Metoda "match" powinna przyjmować String np. "text" przeszukiwać zawartość notatki oraz listę tagów i zwracać true lub false,
//        w zalezności od tego czy znalazło podany String. (Wykorzystać metody klasy String)
//        Notatki powinny mieć unikalny numer zaczynając od 1.
//        Użyj do tego zmiennej statycznej którą będziesz inkrementować. (Coś podobnego już robiliśmy na zajęciach wspólna dla wszystkich Notek,
//        zwiększa się o 1 dla każdej notki i przypisuję tą zwiększoną wartość o 1)
//        Dla spróbuj użyć typu Date dostarczonego przez Javę.

import java.util.Date;

import java.util.ArrayList;

public class Note {
    private String noteText;
    private ArrayList<String> tags;
    private Date date;
    private int id;
    private static int nextId = 1;

    public Note(String noteText, ArrayList<String> tags, Date date) {
        this.noteText = noteText;
        this.tags = tags;
        this.date = date;
        this.id = nextId;
        nextId++;
    }

    public boolean match(String serchTest) {
        boolean czyJestWTagach = false;
        for (String tag : tags) {
            if (serchTest.equals(tag)) {
                czyJestWTagach = true;
                break;
            }
        }
        //return noteText.contains(serchTest) || tags.contains(serchTest);
        return noteText.contains(serchTest) || czyJestWTagach;
    }
}

