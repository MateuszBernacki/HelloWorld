package com.company.PracaDomowa.Dzien4;

//3. Napisać metodę która robi dokładnie to samo co w zadaniu pierwszy ale użyć pętli for w ten sposób,
//        że licznik zaczyna się od 15, i po każdym przebiegu pętli jest zwiększany o 3
//        tj.
//        for(int i = 15; [WARUNEK]; i+=3) {
//        [ZAWARTOŚĆ_PETLI]
public class tabWMet3 {
    public static void main(String[] args) {
        petlaFor(0);
        System.out.println();
        petlaWhile(0);
    }
    static void petlaFor(int i){
        for(i = 0; i < 40; i+=3){
            System.out.print(i + " ");
        }
    }
    static void petlaWhile(int i){
        while(i < 40){
            System.out.print(i + " ");
            i+=3;
        }
    }
}
