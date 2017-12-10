package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    Shape shape;
    ArrayList<Shape> theList = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        theList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(theList.contains(shape)) {
            theList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < theList.size()) {
            shape = theList.get(n);
        }
        return shape;
    }

    public void showFigures(){
    }
}
