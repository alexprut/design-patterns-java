package design_patterns.structural.composite;

import org.junit.*;

public class LineTest {

  @Test
  public void doesDraw() {
    Figure l = new Line();

    Assert.assertEquals(l.draw(), "Draw: Line");
  }
}