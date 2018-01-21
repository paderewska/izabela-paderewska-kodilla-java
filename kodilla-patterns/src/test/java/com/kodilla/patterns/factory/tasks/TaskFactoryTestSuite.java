package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Nowy telewizor", shopping.getTaskName());
        Assert.assertEquals("Kup TV w liczbie 0.0", shopping.executeTask());
        Assert.assertFalse(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Namaluj slonce", painting.getTaskName());
        Assert.assertEquals("Namaluj: Slonce w kolorze zolty", painting.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Jedz do pracy", driving.getTaskName());
        Assert.assertEquals("Jedz do Poznan i wez samochod", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}