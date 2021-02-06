package com.company.JavaPodstawy.Dzien8;

import java.time.LocalDate;
import java.util.Scanner;

public class Zidane17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date zajec (rrrr-mm-dd)");
        String tempData = scanner.nextLine();
        LocalDate data = LocalDate.parse(tempData);
        //sprawdzenie czy data jest w przyszlosci,aktualna czy przeszla
        float compare = data.compareTo(LocalDate.now());
        //koniec sprawdzania
        //sprawdzenie czy data jest w przyszlosci
        boolean test = data.isAfter(LocalDate.now());
        System.out.println(test);
        //koniec sprawdzenia
        //zaleznie od wyniku pierwszego sprawdzania daje rozna widomosc
        if(compare<0){
            System.out.println("Podałeś datę zajęć które już się odbyły");
        } else if(compare==0){
            System.out.println("Zajecia odbywaja się dzisiaj");
        } else {
            System.out.println("Zostało jeszcze: "+ LocalDate.now().until(data).getDays() +" dni");
        }
    }
}
