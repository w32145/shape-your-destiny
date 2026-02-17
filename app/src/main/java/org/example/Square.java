package org.example;

public class Square extends Rectangle {

    public Square(Double length) {
        super(length, length);
    }

    public Double getArea() {
        return super.getArea();
    }

    public Double getPerimeter() {
        return super.getPerimeter();
    }

    public int numberOfSides() {
        return super.numberOfSides();
    }
}
