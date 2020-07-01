package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector  {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (shape == null) {
            return shapes.remove(shape);
        }
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public ArrayList<Shape> showFigures() {

        return shapes;
    }

    public int getShapesQuantity() {
        return shapes.size();
    }
}
