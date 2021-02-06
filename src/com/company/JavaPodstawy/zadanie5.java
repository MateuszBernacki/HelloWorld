package com.company.JavaPodstawy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj ciag znakow");
            String text = scanner.nextLine().trim();
            if (Pattern.matches(".*(rect).*", text)) {
                rect(text);
            }
            if (Pattern.matches(".*(product).*", text)) {
               // product(text);
            }
            if (Pattern.matches(".*(ticket).*", text)) {
               // ticket(text);
            }
        }
    }

    public static void rect(String text) {
        String recStr = text;
        String rectangePattern = ".*(\\d+)\\s+(\\d+).*";
        Pattern pattern = Pattern.compile(rectangePattern);
        Matcher matcher = pattern.matcher(recStr);
        while (matcher.find()) {
            System.out.println("rect: " + matcher.group(1) + " " + matcher.group(2));
        }
    }
}