package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    Shape shape;
    ArrayList<ShapeCollector> theList = new ArrayList<ShapeCollector>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
    }

    public void removeFigure(Shape shape){
    }

    public Shape getFigure(int n){
        Square test = new Square(1,2);
        return test;
    }

    public void showFigures(){
    }
}
