package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    RightTriangle triangle = new RightTriangle(2.0, 6.0);

    @Test
    void areaTest() {
        triangle = new RightTriangle(2.0, 6.0);
        Double actual = Math.round(triangle.getArea() * 100.0) / 100.0;
        assertEquals(6.0, actual);
    }

    @Test
    void perimeterTest() {
        triangle = new RightTriangle(2.0, 6.0);
        Double actual = Math.round(triangle.getPerimeter() * 100.0) / 100.0;
        assertEquals(14.32, actual);
    }

    @Test
    void isocelesAreaTest() {
        triangle = new IsocelesRightTriangle(2.0);
        Double actual = Math.round(triangle.getArea() * 100.0) / 100.0;
        assertEquals(2.0, actual);
    }

    @Test
    void isocelesPerimeterTest() {
        triangle = new IsocelesRightTriangle(2.0);
        Double actual = Math.round(triangle.getPerimeter() * 100.0) / 100.0;
        assertEquals(6.83, actual);
    }

    @Test
    void numberOfSidesTest() {
        triangle = new RightTriangle(2.0, 6.0);
        assertEquals(3, triangle.numberOfSides());
    }
}
