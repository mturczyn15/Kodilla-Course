package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        //When
        double actualAverage = ArrayOperations.getAverage(array);
        double expectedAverage = ((1 + 20.0) / 2);

        //Then
        Assert.assertEquals(expectedAverage, actualAverage,0.001);
    }
}
