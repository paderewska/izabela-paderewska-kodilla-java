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
        ArrayList<Integer> test = oddNumber.exterminate(numbers);
        //then
        Assert.assertTrue(test.isEmpty());
    }
    @Test
    public void testOddNumberExterminatorNormalList() {
        //given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        oddNumbers.add(2);
        oddNumbers.add(4);
        oddNumbers.add(6);
        //when
        ArrayList<Integer> test = oddNumber.exterminate(numbers);
        //then
        Assert.assertEquals(test, oddNumbers);
    }
    @Test
    public void test1(){
        //Given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        //When
        ArrayList<Integer> test = oddNumber.exterminate(numbers);
        //then
        Assert.assertEquals(1, test.size());
        int a = test.get(0);
        Assert.assertEquals(2, a);
    }
    @Test
    public void test21(){
        //Given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        //When
        ArrayList<Integer> test = oddNumber.exterminate(numbers);
        //then
        Assert.assertEquals(0, test.size());
        Assert.assertTrue(test.isEmpty());
    }
    @Test
    public void hejo(){
    int a = 103;
    if(a>=Byte.MIN_VALUE && a<=Byte.MAX_VALUE) {
        byte b = (byte) a;
        System.out.println(b);
    }


    }



}