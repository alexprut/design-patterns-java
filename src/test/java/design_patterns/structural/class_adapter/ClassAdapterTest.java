package design_patterns.structural.class_adapter;

import org.junit.*;

public class ClassAdapterTest {

  @Test
  public void mainTest() {
    Figure[] figures = new Figure[2];

    figures[0] = new Line();
    figures[1] = new AdapterRectangle();

    Assert.assertEquals(figures[0].draw(), "Draw: Line");
    Assert.assertEquals(figures[1].draw(), "Draw: Rectangle");
  }
}