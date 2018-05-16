package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        //when
        shapeCollector.addFigure(new Circle(4));
        //then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //when
        boolean result = shapeCollector.removeFigure(circle);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }
    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //when
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(circle, retrievedShape);
    }
    @Test
    public void testRemoveFigureNotExisting() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        //when
        boolean result = shapeCollector.removeFigure(circle);
        //then
        Assert.assertFalse(result);
    }
}
