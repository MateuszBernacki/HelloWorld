package com.company.PracaDomowa.Dzien4;
//9. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
//        Wskazówka: moża (ale nie trzeba) wykorzystać metodę charAt() obiektu String
//        Przykład dla  “domek”: “kemod”,
//        Spróbować rozwiązać na więcej niż 1 sposób. Przejżeć metody klasy String

import java.util.Scanner;
import java.lang.StringBuilder;
public class TabWMet9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Słowo które ma zostać odwrócone: ");
        String slowo = scanner.nextLine();
        System.out.println(odwracanie(slowo));
    }
    static String odwracanie (String slowo){
        StringBuilder napis = new StringBuilder(slowo);
        napis.reverse();
        String s1 = napis.toString();
       return s1;
    }
}
