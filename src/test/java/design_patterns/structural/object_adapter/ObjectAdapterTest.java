package design_patterns.structural.object_adapter;

import org.junit.*;

public class ObjectAdapterTest {

  @Test
  public void main() {
    Figure[] figures = new Figure[2];

    figures[0] = new Line();
    figures[1] = new AdapterRectangle();

    Assert.assertEquals(figures[0].draw(), "Draw: Line");
    Assert.assertEquals(figures[1].draw(), "Draw: Rectangle");
  }
}