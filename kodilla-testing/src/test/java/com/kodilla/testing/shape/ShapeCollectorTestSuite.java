package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " finished");
    }

    @Test
    public void addFigure() {
        //Given
        Square square1 = new Square(3,5);
        ShapeCollector shapeCollector = new ShapeCollector(square1);

        //When
        shapeCollector.addFigure(square1);

        //Then
        Assert.assertEquals(1, shapeCollector.theList.size());
    }

    @Test
    public void removeFigure() {
        //Given
        Square square1 = new Square(3,5);
        ShapeCollector shapeCollector = new ShapeCollector(square1);
        shapeCollector.addFigure(square1);

        //When
        boolean result = shapeCollector.removeFigure(square1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.theList.size());
    }

    @Test
    public void getFigure(){
        //Given
        Square square1 = new Square(3,5);
        ShapeCollector shapeCollector = new ShapeCollector(square1);
        shapeCollector.addFigure(square1);

        //When
        Shape test = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square1, test);
    }
}
