package design_patterns.structural.object_adapter;

import org.junit.*;

public class ObjectAdapterTest {

  @Test
  public void main() {
    Figure[] figures;

    figures = new Figure[2];
    figures[0] = new Line();
    figures[1] = new AdapterRectangle();

    for (Figure figure : figures) {
      figure.draw();
    }
  }
}