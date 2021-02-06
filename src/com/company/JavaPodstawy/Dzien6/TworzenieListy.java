package com.company.JavaPodstawy.Dzien6;
import java.util.ArrayList;
public class TworzenieListy {
    public static void main(String[] args) {
        ArrayList<String> mojaLista = new ArrayList<>();
        mojaLista.add("Zdzichu");
        mojaLista.add("Kot");
//mojaLista.add(1); błąd
//mojaLista.get(6);
// sprawdzić smodzielnie jak to działa
//mojaLista.add(5, "Kasia");
        System.out.println(mojaLista.size());
        for (String s : mojaLista) {
            System.out.println(s);
        }
            //iter dodaje for ech
    }
}
