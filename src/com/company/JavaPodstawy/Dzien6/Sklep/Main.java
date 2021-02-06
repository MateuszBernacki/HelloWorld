package com.company.JavaPodstawy.Dzien6.Sklep;
import java.util.ArrayList;
import java.util.List;


//Zadanie 3. Stworzyć klasę sklep (Store) który zawiera pola:
//        - lista produktów (pole typu List) parametryzowana typem Product z zadania 1 (List<Product> productList).
//        Następnie:
//        - Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę produktów (oczywiście chodzi przpisaniu nowej pustej listy polu
//        klasy "productList" - najlepiej ArrayList) i wypełnia ją przykładowymi danymi 5-10 produktów.
//        Następnie dodać następujące metody
//        - Stworzyć metodę addProduct, która przyjmuje 1 argument typu Product (z zadania 1) i dodaje go do listy produktów.
//        - Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę produktów;
//        - Stworzyć metodę removeProduct, która przyjmuje 1 argument typu Product (z zadania 1) i usuwa go z listy produktów ----->
//        ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
//        - Stworzyć metodę getProductQuantity, która przy przyjmuje 1 argument typu String, który jest nazwą produktu i zwraca typ
//        int z ilością danego produktu lub -1 jeśli nie ma na liście takiego produktu.

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Product product = new Product();

        Product vodka = new Product( "Absolut", 20, true, 18, 23,100);
        Product cola = new Product("Cola", 6, true, 5, 23, 250);
        Product table = new Product("table", 250, false, 250, 8, 35);
        Product knife = new Product("Knife", 39, false, 39, 23, 60);
        Product flower = new Product("Flower", 69, true, 63, 23, 30);


        Store.addProduct(vodka);
        Store.addProduct(cola);
        Store.addProduct(table);
        Store.addProduct(knife);
        Store.addProduct(flower);

        store.showProduct();
        System.out.println();
        store.wyszukiwanieProduktuDoUsuniecia();
        System.out.println();
        store.showProduct();
        System.out.println();
        store.wyszukiwanieIlosciProduktu();
        System.out.println();
        store.showProduct();


        User user1  = new User("Jasiek", "Staszkiewicz", "Jas", "stasz", 25);

    }
}
