package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite implements ArrayOperations{

    @Test
    public void testGetAverage(){

        //Given
        int[] example = new int[4];
        example[0] = 40;
        example[1] = 25;
        example[2] = 10;
        example[3] = 5;

        //When
        double testAverage = ArrayOperations.getAverage(example);

        //Then
        Assert.assertEquals(20.0, testAverage, 0);
    }
}
