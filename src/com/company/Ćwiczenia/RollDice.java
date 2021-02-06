package com.company.Ćwiczenia;

public class RollDice {
    public static void main(String[] args) {
        int result = (int) (Math.random() * 6 + 1);
        switch (result) {
            case 1: 
            case 3:
            case 5:
                System.out.println("Wynik parzysty");
                break;

            case 2:
            case 4:
                System.out.println("Wynik nieparzysty");
                break;
            case 6:
              System.out.println("Wynik nieparzysty");
              System.out.println("wygraleś");
        }
    }
}
