package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        World world = new World();
        List<Continent> theListOfContinent = new ArrayList<>();

        theListOfContinent.add(new Continent("Europe", new Country("Poland", "37310341")));
        theListOfContinent.add(new Continent("Europe", new Country("Italy", "61680122")));
        theListOfContinent.add(new Continent("Europe", new Country("Romania", "21729871")));
        theListOfContinent.add(new Continent("Europe", new Country("Ukraine", "42805731")));
        theListOfContinent.add(new Continent("Asia", new Country("China", "1306313813")));
        theListOfContinent.add(new Continent("Asia", new Country("Japan", "128917246")));
        theListOfContinent.add(new Continent("Asia", new Country("Thailand", "64185502")));
        theListOfContinent.add(new Continent("Africa", new Country("Egypt", "81714000")));
        theListOfContinent.add(new Continent("South America", new Country("Brazil", "198739269")));
        theListOfContinent.add(new Continent("North America", new Country("Mexico", "107563903")));

        //When
        BigDecimal totalPeopleNumber = world.getPeopleQuantity(theListOfContinent);

        //Then
        BigDecimal goodNumber = new BigDecimal("2050959798");
        Assert.assertEquals(goodNumber, totalPeopleNumber);
    }
}
