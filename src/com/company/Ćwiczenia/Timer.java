package com.company.Ćwiczenia;

import java.time.*;
import java.time.ZonedDateTime;


public class Timer {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.print(zonedDateTime.getDayOfWeek() + " ");
        System.out.print(zonedDateTime.getDayOfMonth() + " ");
        System.out.println(zonedDateTime.getMonth());

        switch(zonedDateTime.getHour()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Rano");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Do południa");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Popołudniu");
                break;
            case 18:
            case 19:
            case 20:
                System.out.println("Wieczór");
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("W nocy");
            default:
                System.out.println("Koniec świata");
        }
        switch(zonedDateTime.getDayOfWeek()){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Dzień pracujący");
                break;
            case SATURDAY:
                System.out.println("Dień wolny");
                break;
            case SUNDAY:
                System.out.println("święto");
            default:
        }
        if(zonedDateTime.getDayOfMonth() == 10) System.out.println("Wypłata!!!!!! Szastaj chajsem biedaku :)");

        switch(zonedDateTime.getMonth()){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Zima");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Wiosna");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Lato");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Jesień");
                break;

        }
    }
}
