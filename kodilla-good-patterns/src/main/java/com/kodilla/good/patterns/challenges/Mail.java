package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Mail implements ConfirmationService{

    @Override
    public boolean sendConfirmation(User user, LocalDate data) {
        return true;
    }
}
