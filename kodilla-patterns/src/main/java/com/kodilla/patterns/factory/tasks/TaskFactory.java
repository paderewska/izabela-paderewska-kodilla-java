package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Nowy telewizor", "TV", 0);
            case PAINTING:
                return new PaintingTask("Namaluj slonce", "zolty", "Slonce");
            case DRIVING:
                return new DrivingTask("Jedz do pracy", "Poznan", "samochod");
                default:
                    return null;
        }
    }
}