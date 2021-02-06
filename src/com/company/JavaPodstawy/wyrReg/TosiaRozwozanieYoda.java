package com.company.JavaPodstawy.wyrReg;

import java.util.Scanner;

public class TosiaRozwozanieYoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] split = text.split("\\s+");
        for (int i = split.length - 1; i >= 0; i--) System.out.print(split[i] + " ");
    }
}

