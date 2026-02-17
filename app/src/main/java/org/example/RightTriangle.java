package org.example;

public class RightTriangle extends Shape {
    private Double length;
    private Double width;

    public RightTriangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getArea() {
        return 0.5 * length * width;
    }

    public Double getPerimeter() {
        return length + width + Math.sqrt(length * length + width * width);
    }
}
