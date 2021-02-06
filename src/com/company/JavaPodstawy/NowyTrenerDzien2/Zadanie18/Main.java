package com.company.JavaPodstawy.NowyTrenerDzien2.Zadanie18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program sprawdza czy zrobiłeś aaaaa psik: ");
        String psik = scanner.nextLine();

        String pattern = "a+\\s{1}psik";
        boolean isPatern = Pattern.matches(pattern, psik);
        if(isPatern == true) System.out.println("na zdrowie");
        else System.out.println(" nie kichnales ale i tak na zdroiwe");
    }
}
