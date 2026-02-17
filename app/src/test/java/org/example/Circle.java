package org.example;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
    return Math.PI * radius * radius;
    }

    public Double getPerimeter() {
    return 2 * Math.PI * radius;
    }
}
