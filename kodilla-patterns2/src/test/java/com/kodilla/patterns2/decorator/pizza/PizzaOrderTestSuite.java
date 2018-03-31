package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal costs = pizzaOrder.getCost();

        //Given
        assertEquals(new BigDecimal(15), costs);
    }

    @Test
    public void testBasicPizzaGetDescription() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();

        //Given
        assertEquals("Pizza dough and tomato sauce with cheese", description);

    }

    @Test
    public void testPizzaWithAdditionalCheeseAndOlivesGetCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);

        //When
        BigDecimal costs = pizzaOrder.getCost();

        //Given
        assertEquals(new BigDecimal(20), costs);
    }


    @Test
    public void testPizzaWithAdditionalCheeseAndOlivesGetDescription() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Given
        assertEquals("Pizza dough and tomato sauce with cheese + additional cheese + olives", description);
    }

    @Test
    public void testPizzaWithMushroomsAndAsparagusGetCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new AsparagusDecorator(pizzaOrder);

        //When
        BigDecimal costs = pizzaOrder.getCost();

        //Given
        assertEquals(new BigDecimal(21), costs);
    }

    @Test
    public void testPizzaWithMushroomsAndAsparagusGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new AsparagusDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Given
        assertEquals("Pizza dough and tomato sauce with cheese + mushrooms + asparagus", description);
    }

    @Test
    public void testPizzaWithPepperAndOlivesAndAdditionalCheeseGetCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PepperDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //When
        BigDecimal costs = pizzaOrder.getCost();

        //Given
        assertEquals(new BigDecimal(22.5), costs);
    }

    @Test
    public void testPizzaWithPepperAndOlivesAndAdditionalCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PepperDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Given
        assertEquals("Pizza dough and tomato sauce with cheese + pepper + olives + additional cheese", description);
    }

}