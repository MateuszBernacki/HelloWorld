package com.company.JavaPodstawy.wyrReg;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrReg3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj ciag znakow");
            String text = scanner.nextLine().trim();
            String yodaPattern = "([^\\s])+";
            Pattern pattern = Pattern.compile(yodaPattern);
            Matcher matcher = pattern.matcher(text);
            System.out.println();
            List lista = new ArrayList();
            while (matcher.find()) {
                lista.add(matcher.group());
            }
            for (int i = lista.size(); i > 0; i--) {
                System.out.print(lista.get(i - 1) + " ");
            }
            System.out.println();
        }
    }
}


