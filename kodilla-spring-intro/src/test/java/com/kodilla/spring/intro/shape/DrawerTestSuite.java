package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {

    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();

        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        //Then
        Assert.assertEquals("Kolo", result);
    }

    @Test
    public void testDoDrawingWIthTriangle() {
        //Given
        Triangle triangle = new Triangle();

        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //Then
        Assert.assertEquals("Kwadrat", result);
    }
}