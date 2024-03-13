package design_patterns.structural.composite;

import org.junit.*;

public class CompositeTest {

  @Test
  public void doesDraw() {
    Figure c = new Composite();
    c.add(new Point());
    c.add(new Line());

    Assert.assertEquals(c.draw(), "Draw: Point Draw: Line ");
  }

  @Test
  public void doesAddFigure() {
    Figure c = new Composite();
    Assert.assertEquals(c.draw(), "");

    c.add(new Point());
    Assert.assertEquals(c.draw(), "Draw: Point ");
  }

  @Test
  public void doesRemoveFigure() {
    Figure c = new Composite();
    Figure p = new Point();
    c.add(p);
    c.remove(p);

    Assert.assertEquals(c.draw(), "");
  }
}