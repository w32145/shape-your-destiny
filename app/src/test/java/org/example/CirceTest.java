package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirceTest {
    Shape circle = new Circle(2.0);

  @Test
  void areaTest() {
    circle = new Circle(2.0);
    Double actual = Math.round(circle.getArea() * 100.0) / 100.0;
    assertEquals(12.57, actual);
  }

  @Test
  void perimeterTest() {
    circle = new Circle(2.0);
    Double actual = Math.round(circle.getPerimeter() * 100.0) / 100.0;
    assertEquals(12.57, actual);
  }
}
