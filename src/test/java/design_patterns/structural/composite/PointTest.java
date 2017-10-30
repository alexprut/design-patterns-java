package design_patterns.structural.composite;

import org.junit.*;

public class PointTest {

  @Test
  public void doesDraw() {
    Figure p = new Point();

    Assert.assertEquals(p.draw(), "Draw: Point");
  }
}