package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Save to log");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Save to log", lastLog);
    }
}
