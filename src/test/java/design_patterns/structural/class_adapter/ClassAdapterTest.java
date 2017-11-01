package design_patterns.structural.class_adapter;

import org.junit.*;

public class ClassAdapterTest {

  @Test
  public void designPatternTest() {
    Figure[] figures = new Figure[]{
        new Line(),
        new AdapterRectangle()
    };

    Assert.assertEquals(figures[0].draw(), "Draw: Line");
    Assert.assertEquals(figures[1].draw(), "Draw: Rectangle");
  }
}