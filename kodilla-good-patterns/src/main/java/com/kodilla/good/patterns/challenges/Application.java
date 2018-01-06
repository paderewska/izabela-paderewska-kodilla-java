package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String args[]) {

        PurchasePutData purchasePutData = new PurchasePutData();
        Purchase purchase = purchasePutData.order();

        ProductOrderService productOrderService = new ProductOrderService(new Mail(), new BigParcel(), new UpdateCrm());

        productOrderService.process(purchase);



    }
}
