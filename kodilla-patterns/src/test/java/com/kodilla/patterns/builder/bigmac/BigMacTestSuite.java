package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacBuilder() {

        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll("bulka sezamowa")
                .burgers(2)
                .sauce("standard")
                .ingredient("cebula")
                .ingredient("salata")
                .build();
        System.out.println(bigMac);

        //When
        int ingredientsCounter = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals(2, ingredientsCounter);
    }
}