package com.company.JavaPodstawy.Dzien6.Sklep;
//Zadanie 1. Stworzyć klasę "Product", powinna ona zawierać pola określające:
//        nazwę
//        cenę
//        czy jest w promocji (boolean)
//        cenę promocyjną
//        stawkę VAT
//        ilosc

public class Product {
    private String name;
    private int price;
    private boolean inPromo;
    private int promoPrice;
    private int vat;
    private int number;
    private Store store;

    public Product(String name, int price, boolean inPromo, int promoPrice, int vat, int number) {
        this.name = name;
        this.price = price;
        this.inPromo = inPromo;
        this.promoPrice = promoPrice;
        this.vat = vat;
        this.number = number;
    }

    public Product() {
    }

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public int getPrice() {
        return price;    }
    public void setPrice(int price) {
        this.price = price;    }
    public boolean isInPromo() {
        return inPromo;    }
    public void setInPromo(boolean inPromo) {
        this.inPromo = inPromo;    }
    public int getPromoPrice() {
        return promoPrice;    }
    public void setPromoPrice(int promoPrice) {
        this.promoPrice = promoPrice;    }
    public int getVat() {
        return vat;    }
    public void setVat(int vat) {
        this.vat = vat;    }
    public int getNumber() {
        return number;    }
    public void setNumber(int number) {
        this.number = number;    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inPromo=" + inPromo +
                ", promoPrice=" + promoPrice +
                ", vat=" + vat +
                ", number=" + number +
                '}';
    }
}
