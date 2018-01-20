package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        String komuna = "komuna";
        Logger.getInstance().log(komuna);

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("komuna", result);
    }
}