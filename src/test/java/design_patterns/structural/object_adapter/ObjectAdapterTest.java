package design_patterns.structural.object_adapter;

import org.junit.*;

public class ObjectAdapterTest {

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