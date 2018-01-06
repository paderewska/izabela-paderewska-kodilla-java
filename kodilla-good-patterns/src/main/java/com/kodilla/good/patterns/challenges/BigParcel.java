package com.kodilla.good.patterns.challenges;

public class BigParcel implements ParcelSending {

    @Override
    public void sendTheParcel(User user) {
        System.out.println("Duza paczucha");
        System.out.println("Odbiorca paczki to: " + user.getName() + " " + user.getSurname() +"\n");
    }
}
