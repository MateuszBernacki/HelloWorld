package com.company.JavaPodstawy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Mainasd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków, kod pocztowy, telefon, e-mail: ");
        String tekst = scanner.nextLine().toLowerCase().trim();
//
//        String wzorzec = "[aeouyi][a-z]+";
//        System.out.println("Czy w  tekscie jest słowo od samogłoski: " + Pattern.matches(wzorzec,tekst));

        String postCode = "\\d{2}\\s?-\\s?\\d{3}";
        if (Pattern.matches(postCode,tekst)) System.out.println("Jest to kod pocztowy");
        else System.out.println("To nie jest kod pocztowy");

        String telephoneNumber = "\\d{2}\\s+\\d{9}";
        if (Pattern.matches(telephoneNumber,tekst)) System.out.println("Jest to nr. telefonu");
        else System.out.println("To nie jest nr telefonu");

        String emailAdress = ".*\\s+([A-Za-z1-9][\\dA-z-_.]+@([A-z\\d-]+\\.){1,6}[A-z]{2,6}).*";
        if (Pattern.matches(emailAdress,tekst)) System.out.println("Podaleś adres email");
        else System.out.println("to nie jest adres email");
    }
}
