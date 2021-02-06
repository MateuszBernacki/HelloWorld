package com.company.PracaDomowa.Dzien4.PetleTabliceIMetody;
//5. Napisz metodę, która przyjmuje tablicę String-ów i tworzy nowš tablicę Strintów,
// która jest odwróconš pierwszš
//        Oczekiwane działanie:
//
//        String[] napisy = {"aaaa", "bbbb", "ccccc"}
//        reverseTableOfStrings(napisy) = {"ccccc", "bbbb", "aaaa"}
//


public class PTiM5 {
    public static void main(String[] args) {

        String[] napisy = {"aaaa", "bbbb", "ccccc"};
        for(int i =0; i < napisy.length; i++) {
            System.out.print(napisy[i]);
        }
        System.out.println();
        odwrotnaTab(napisy);
    }
    static void odwrotnaTab (String[] nowynapis){
        for(int j = nowynapis.length-1;j >= 0; j--) {
            System.out.print(nowynapis[j]);
        }
    }
}
