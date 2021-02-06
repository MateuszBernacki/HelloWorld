package com.company.JavaPodstawy.wyrReg;
import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {


        private  static String patternKod = ".*\\s*(\\d{2}\\s?-\\s?\\d{3}).*";
        private  static String patternTel = ".*\\s*(\\d{2}\\s?\\d{3}\\s?\\d{3}\\s?\\d{3}).*";
        private static String patternEmail = ".*\\s+([0-9a-zA-Z][\\dA-z-_.]+@([A-z\\d][A-z\\d-]+\\.){1,6}[A-z]{2,6}).*";
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            String text = scanner.nextLine();
            if(Pattern.matches(patternKod,text)) System.out.println("Podany przez ciebie text zawiera kod pocztowy");
            if(Pattern.matches(patternTel,text)) System.out.println("Podany przez ciebie teks zawiera numer telefonu");
            if(Pattern.matches(patternEmail,text)) System.out.println("Podany przez ciebie tekst zawiera adres mailowy");
        }

}
