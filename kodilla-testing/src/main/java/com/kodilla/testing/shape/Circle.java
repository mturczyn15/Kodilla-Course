package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.round(Math.PI * 2 * r);
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", getShapeName(), r);
    }
}
