package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    int a;
    int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getShapeName() {
        return "Triangle";
    }
    public int getField(){
        return (int) (0.5 * this.a * this.b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b);
    }
}
