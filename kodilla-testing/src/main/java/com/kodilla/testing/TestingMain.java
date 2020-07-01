package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        Square square = new Square(4);
        System.out.println(square);
        Shape shape = new Circle(5);
        System.out.println(shape);
        Shape triangle = new Triangle(4,6);
        System.out.println(triangle);
    }
}
