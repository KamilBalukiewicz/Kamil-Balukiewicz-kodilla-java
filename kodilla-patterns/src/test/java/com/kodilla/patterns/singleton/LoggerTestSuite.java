package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openLog() {
        Logger.getInstance().log("Sample log");
    }

    @Test
    public void testGetLastLog() {

        //given
        //when
        String lastLog = Logger.getInstance().getLastLog();
        //then
        Assert.assertEquals("Sample log", lastLog);
    }

}
