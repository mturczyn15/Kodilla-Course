package com.kodilla.testing.shape;
import org.junit.*;
import java.util.ArrayList;

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
        System.out.println("Preparing to execute test: " + testCounter);
    }

    @After
    public void afterEveryTest() { System.out.println("Test finished.");
    }

    @Test
    public void testAddFigure() {

        //Given
        Shape circle = new Circle(4);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(1, collector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure() {

        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, collector.getShapesQuantity());
    }

    @Test
    public void testGetFigure() {

        //Given
        Shape shape = new Circle(5);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(shape);

        //When
        Shape retrievedShape;
        retrievedShape = collector.getFigure(0);

        //Then
        Assert.assertEquals(shape, retrievedShape);
    }

    @Test
    public void testGetShapes() {

        //Given
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(5,4);
        Shape square = new Square(8);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        collector.addFigure(triangle);
        collector.addFigure(square);
        ArrayList<Object> list = new ArrayList<>();
        list.add(circle);
        list.add(triangle);
        list.add(square);

        //When
        ArrayList<Shape> retrievedlist = collector.showFigures();

        //Then
        Assert.assertEquals(list, retrievedlist);

    }
}
