package com.kodilla.good.patterns.fruits;

public class OrderInformation {

    private String supplier;
    private int ProductNumber;
    private String productName;

    public OrderInformation(String supplier, int productNumber, String productName) {
        this.supplier = supplier;
        ProductNumber = productNumber;
        this.productName = productName;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getProductNumber() {
        return ProductNumber;
    }

    public String getProductName() {
        return productName;
    }
}
