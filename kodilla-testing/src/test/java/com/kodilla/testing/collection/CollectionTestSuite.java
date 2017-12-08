package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: start");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //when
        oddNumber.exterminate(numbers);
        //then

        Assert.assertTrue(oddNumber.newList.isEmpty());
    }
    @Test
    public void testOddNumberExterminatorNormalList(){
        //given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random generator = new Random();
        for(int n=0; n<10; n++) {
            numbers.add(generator.nextInt(100));
        }
         //when
         oddNumber.exterminate(numbers);
         //then
        Assert.assertTrue(oddNumber.newList.get(0)%2 == 0);
        }
}
