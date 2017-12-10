package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    double pi = 3.14;
    int a;

    public Circle(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public String getShapeName() {
        return "Circle";
    }
    public int getField(){
        return (int) pi * this.a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.pi, pi) == 0 &&
                a == circle.a;
    }

    @Override
    public int hashCode() {

        return Objects.hash(pi, a);
    }
}
