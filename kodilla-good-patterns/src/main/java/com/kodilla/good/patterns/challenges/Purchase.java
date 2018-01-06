package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Purchase {

    public User user;
    public LocalDate purchaseData;

    public Purchase(User user, final LocalDate purchaseData) {
        this.user = user;
        this.purchaseData = purchaseData;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getPurchaseData() {
        return purchaseData;
    }
}
