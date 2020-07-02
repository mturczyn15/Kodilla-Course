package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculation() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(2,3);
        double sub = calculator.sub(5, 3);
        double mul = calculator.mul(2,5);
        double div = calculator.div(10, 5);

        //Then
        Assert.assertEquals(5, sum, .01);
        Assert.assertEquals(2, sub, .01);
        Assert.assertEquals(10 , mul, .01);
        Assert.assertEquals(2, div, .01);
    }
}