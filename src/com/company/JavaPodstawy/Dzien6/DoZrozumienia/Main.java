package com.company.JavaPodstawy.Dzien6.DoZrozumienia;

class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Reksio", 1, 1);
        Animal a2 = new Animal("Mruczek", 2, 10);
        Caretaker caretaker = new Caretaker("Andrzej", "Marek", 30);
        caretaker.registerAnimal(a1);
        caretaker.registerAnimal(a2);
        System.out.println(a1.getName());
        System.out.println(a1.getId());
        System.out.println(a1.getCageNumber());
        System.out.println(a1.getCaretaker().getName());
        System.out.println(caretaker.getAnimals().size());
        System.out.println(caretaker.getAnimals());
        System.out.println(a1.toString());
    }
}