package org.example;

public class Rectangle extends Shape implements Polygon {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getArea() {
        return length * width;
    }

    public Double getPerimeter() {
        return 2 * (length + width);
    }

    public int numberOfSides() {
        return 4;
    }
}
