package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
        int[] numbers = new int[20];
        //when
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 14;
        numbers[5] = 16;
        numbers[6] = 19;
        numbers[7] = 25;
        numbers[8] = 28;
        numbers[9] = 34;
        numbers[10] = 37;
        numbers[11] = 38;
        numbers[12] = 42;
        numbers[13] = 43;
        numbers[14] = 45;
        numbers[15] = 57;
        numbers[16] = 62;
        numbers[17] = 74;
        numbers[18] = 75;
        numbers[19] = 87;
        //then
        Assert.assertEquals(35.7, ArrayOperations.getAverage(numbers), 0.001);

    }
}
