package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    int length1;
    int lenght2;

    public Square(int length1, int lenght2) {
        this.length1 = length1;
        this.lenght2 = lenght2;
    }

    public int getLength1() {
        return length1;
    }

    public int getLenght2() {
        return lenght2;
    }

    public String getShapeName() {
        return "Square";
    }
    public int getField(){
        return this.length1 * this.lenght2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return length1 == square.length1 &&
                lenght2 == square.lenght2;
    }

    @Override
    public int hashCode() {

        return Objects.hash(length1, lenght2);
    }
}
