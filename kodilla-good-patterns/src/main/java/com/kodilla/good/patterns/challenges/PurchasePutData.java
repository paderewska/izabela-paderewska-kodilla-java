package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class PurchasePutData {

    public Purchase order() {

        User user = new User("Barbara", "Kalata");
        LocalDate data = LocalDate.of(2017, 1, 6);

        return new Purchase(user, data);
    }
}
