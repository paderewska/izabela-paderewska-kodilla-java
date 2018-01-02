package com.kodilla.lotto;

import java.util.ArrayList;
import java.util.List;

public final class Book {

    private final String title;
    private final List<String> theList;

    public Book(final String title, final List<String> theList) {
        this.title = title;
        this.theList = theList;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTheList() {
        return new ArrayList<>(theList);
    }


    public static void main(String args[]){

        List<String> jakasLista = new ArrayList<>();
        jakasLista.add("rozdzial1");
        jakasLista.add("rozdzial2");
        Book jakasKsiazka = new Book("tytulek", jakasLista);

        System.out.println(jakasKsiazka.getTheList());
        jakasKsiazka.getTheList().add("rozdzial3");
        System.out.println(jakasKsiazka.getTheList());

        String text = "Java";

        text = text.replace('a', 'A');

        System.out.println(text);



    }
}
