package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle(2.0,6.0);

  @Test
  void areaTest() {
    rectangle = new Rectangle(2.0,6.0);
    Double actual = Math.round(rectangle.getArea() * 100.0) / 100.0;
    assertEquals(12.0, actual);
  }

  @Test
  void perimeterTest() {
    rectangle = new Rectangle(2.0,6.0);
    Double actual = Math.round(rectangle.getPerimeter() * 100.0) / 100.0;
    assertEquals(16.0, actual);
  }

  @Test
  void squareAreaTest() {
    rectangle = new Square(2.0);
    Double actual = Math.round(rectangle.getArea() * 100.0) / 100.0;
    assertEquals(4.0, actual);
  }

  @Test
  void squarePerimeterTest() {
    rectangle = new Square(2.0);
    Double actual = Math.round(rectangle.getPerimeter() * 100.0) / 100.0;
    assertEquals(8.0, actual);
  }

  @Test
  void numberOfSidesTest() {
    rectangle = new Rectangle(2.0, 6.0);
    assertEquals(4, rectangle.numberOfSides());
  }
}
