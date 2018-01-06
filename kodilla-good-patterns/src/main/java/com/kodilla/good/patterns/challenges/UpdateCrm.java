package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class UpdateCrm implements DatabaseUpdate{

    @Override
    public void updateDatabase(User user, LocalDate data) {
        System.out.println("Wpisywanie danych do bazy:");
        System.out.println(user.getName() + " " + user.getSurname());
        System.out.println("Zakup dnia: " + data.getYear() + "/" + data.getMonthValue() + "/" + data.getDayOfMonth());

    }
}
