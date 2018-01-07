package com.kodilla.good.patterns.fruits;

public class OrderDone implements OrderConfirmation {

    @Override
    public boolean confirmIfDone(OrderInformation orderInformation) {
        return true;
    }
}
