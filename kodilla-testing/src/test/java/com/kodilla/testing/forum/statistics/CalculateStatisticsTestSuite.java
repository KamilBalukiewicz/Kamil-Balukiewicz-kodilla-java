package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWhen0posts() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            userNames.add("user" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //when
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(0.1, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWhen1000postsAndMorePostsThanComments() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            userNames.add("user" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //when
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(1, calculateStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(0.1, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0.1, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWhen0comments() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for (int n = 0; n < 1000; n++) {
            userNames.add("user" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(10);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //when
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(0.01, calculateStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWhenMoreCommentsThanPostsAnd100users() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            userNames.add("user" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //when
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(0.1, calculateStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(1, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(10, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        calculateStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWhen0users() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(100);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //when
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(1, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        calculateStatistics.showStatistics();
    }
}
