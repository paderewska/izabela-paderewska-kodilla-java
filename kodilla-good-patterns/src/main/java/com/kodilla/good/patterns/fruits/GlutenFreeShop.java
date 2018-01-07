package com.kodilla.good.patterns.fruits;

public class GlutenFreeShop implements OrderProcessing{

    @Override
    public void process(OrderInformation orderInformation) {
        System.out.println("Zamowienie wyslane do dostawcy Gluten Free Shop");
        System.out.println("Zamowiony produkt to: " + orderInformation.getProductName());
        System.out.println("Liczba sztuk: " + orderInformation.getProductNumber());
    }
}
