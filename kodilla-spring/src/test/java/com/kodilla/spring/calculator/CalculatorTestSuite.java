package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2,3);
        double subResult = calculator.sub(4,1);
        double mulResult = calculator.mul(2, 7);
        double divResult = calculator.div(5, 2);

        //Then
        Assert.assertEquals(5.0, addResult, 0);
        Assert.assertEquals(3.0, subResult, 0);
        Assert.assertEquals(14.0, mulResult, 0);
        Assert.assertEquals(2.5, divResult, 0);
    }
}
