package com.kodilla.good.patterns.fruits;

public class OrderDto {

    public OrderInformation orderInformation;
    public boolean isSent;

    public OrderDto(final OrderInformation orderInformation, final boolean isSent) {
        this.orderInformation = orderInformation;
        this.isSent = isSent;
    }

    public OrderInformation getOrderInformation() {
        return orderInformation;
    }

    public boolean isSent() {
        return isSent;
    }
}
