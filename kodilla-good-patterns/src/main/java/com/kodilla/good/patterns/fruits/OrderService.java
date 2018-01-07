package com.kodilla.good.patterns.fruits;

public class OrderService {

    private OrderProcessing orderProcessing;
    private OrderConfirmation orderConfirmation;

    public OrderService(final OrderProcessing orderProcessing, final OrderConfirmation orderConfirmation) {
        this.orderProcessing = orderProcessing;
        this.orderConfirmation = orderConfirmation;
    }

        public OrderDto order(final OrderInformation orderInformation){
            boolean isSent = orderConfirmation.confirmIfDone(orderInformation);

            if(isSent) {
                orderProcessing.process(orderInformation);
                return new OrderDto(orderInformation, true);
            } else {
                return new OrderDto(orderInformation, false);
            }
        }
    }

