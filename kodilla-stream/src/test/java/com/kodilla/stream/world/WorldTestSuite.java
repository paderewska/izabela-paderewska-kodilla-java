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
        List<Continent> theListOfContinents = new ArrayList<>();
        World world = new World(theListOfContinents);

        List<Continent> theListOfCountries = new ArrayList<>();

        List<Country> europeList = new ArrayList<>();
        List<Country> asiaList = new ArrayList<>();
        List<Country> africaList = new ArrayList<>();
        List<Country> southAmericaList = new ArrayList<>();
        List<Country> northAmericaList = new ArrayList<>();

        Continent europe = new Continent(europeList);
        Continent asia = new Continent(asiaList);
        Continent africa = new Continent(africaList);
        Continent southAmerica = new Continent(southAmericaList);
        Continent northAmerica = new Continent(northAmericaList);

        Country poland = new Country("Poland", "37310341");
        Country italy = new Country("Italy", "21729871");
        Country ukraine = new Country("Ukraine", "42805731");
        Country romania = new Country("Romania", "21729871");
        Country china = new Country("China", "37310341");
        Country japan = new Country("Japan", "128917246");
        Country thailand = new Country("Thailand", "64185502");
        Country egypt = new Country("Egypt", "81714000");
        Country brazil = new Country("Brazil", "198739269");
        Country mexico = new Country("Mexico", "107563903");

        europeList.add(poland);
        europeList.add(italy);
        europeList.add(ukraine);
        europeList.add(romania);
        asiaList.add(china);
        asiaList.add(japan);
        asiaList.add(thailand);
        africaList.add(egypt);
        southAmericaList.add(brazil);
        northAmericaList.add(mexico);

        theListOfContinents.add(europe);
        theListOfContinents.add(asia);
        theListOfContinents.add(africa);
        theListOfContinents.add(southAmerica);
        theListOfContinents.add(northAmerica);

        //When
        BigDecimal totalPeopleNumber = world.getPeopleQuantity(theListOfContinents);

        //Then
        BigDecimal goodNumber = new BigDecimal("742006075");
        Assert.assertEquals(goodNumber, totalPeopleNumber);
    }
}
