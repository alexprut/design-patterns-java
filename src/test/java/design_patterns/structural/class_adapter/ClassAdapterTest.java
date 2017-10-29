package design_patterns.structural.class_adapter;

import org.junit.*;

public class ClassAdapterTest {

  @Test
  public void mainTest() {
    Figure[] figures;

    figures = new Figure[2];
    figures[0] = new Line();
    figures[1] = new AdapterRectangle();

    for (Figure figure : figures) {
      figure.draw();
    }
  }
}