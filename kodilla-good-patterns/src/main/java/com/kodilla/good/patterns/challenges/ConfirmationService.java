package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface ConfirmationService {

    boolean sendConfirmation(User user, LocalDate data);
}
