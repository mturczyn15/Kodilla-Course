package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");

    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumberExterminator exterminator = new OddNumberExterminator();
        //When
        System.out.println("Testing empty lists");
        List<Integer> actualList = exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(new ArrayList<Integer>(), actualList);

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(23);
        numbers.add(32);
        numbers.add(50);
        numbers.add(41);
        OddNumberExterminator exterminator = new OddNumberExterminator();
        //When
        System.out.println("Testing lists with various numbers");
        List<Integer> actualList = exterminator.exterminate(numbers);
        //Then
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(32);
        expectedList.add(50);
        Assert.assertEquals(expectedList, actualList);
    }
}
