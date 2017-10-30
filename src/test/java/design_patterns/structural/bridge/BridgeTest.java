package design_patterns.structural.bridge;

import org.junit.*;

public class BridgeTest {

  @Test
  public void mainTest() {
    DrawProgram dp1 = new DrawProgram1();
    DrawProgram dp2 = new DrawProgram2();
    Shape[] shapes = new Shape[]{
        new Circle(dp1),
        new Circle(dp2),
        new Line(dp1),
        new Line(dp2)
    };

    Assert.assertEquals(shapes[0].draw(), "DrawProgram1: Circle");
    Assert.assertEquals(shapes[1].draw(), "DrawProgram2: Circle");
    Assert.assertEquals(shapes[2].draw(), "DrawProgram1: Line");
    Assert.assertEquals(shapes[3].draw(), "DrawProgram2: Line");
  }
}
