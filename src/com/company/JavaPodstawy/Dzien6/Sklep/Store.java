package com.company.JavaPodstawy.Dzien6.Sklep;


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


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private String nameOfStore;
    static List<Product> products =new ArrayList<>();



    public static void addProduct(Product newProduct){
        products.add(newProduct);
    }
    public void removeProduct(Product delProduct){
        products.remove(delProduct);
    }

    public void showProduct() {
        for (Product produkt :
                products) {
            System.out.println(produkt);
        }
    }

    public void wyszukiwanieProduktuDoUsuniecia() {

        Product produktDoUsuniecia = null;
        boolean jestProduktDoUsuniecia = false;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe produktu do usunięcia: ");
        name = scanner.nextLine();
        for (Product produkt :
                products) {
            if (produkt.getName().equals(name)){
                System.out.println("Znalazlem produkt: " + produkt.getName());
                produktDoUsuniecia = produkt;
                jestProduktDoUsuniecia = true;
            }
        }
        if (jestProduktDoUsuniecia) removeProduct(produktDoUsuniecia);
        else System.out.println("Nie ma takiego produktu.");
    }
    public void wyszukiwanieIlosciProduktu() {

        Product znalezionoProdukt = null;
        boolean jestProdukt = false;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe produktu aby uzyskac informacje o ilości: ");
        name = scanner.nextLine();
        for (Product product :
                products) {
            if (product.getName().equals(name)) {
                znalezionoProdukt = product;
                jestProdukt = true;
            }
        }
        if (jestProdukt) System.out.println("Produkt " + znalezionoProdukt.getName() + " jest w ilości " + znalezionoProdukt.getNumber());
        else System.out.println("Niema takiego produktu");
    }


    public Store(String nameOfStore) {
        this.nameOfStore = nameOfStore;
    }

    public String getNameOfStore() {
        return nameOfStore;
    }

    public void setNameOfStore(String nameOfStore) {
        this.nameOfStore = nameOfStore;
    }

    public ArrayList<Product> getProducts() {
        return (ArrayList<Product>) products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Store() {
    }

    @Override
    public String toString() {
        return "Store " +
                nameOfStore;
    }
}
