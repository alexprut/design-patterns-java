package design_patterns.structural.facade;

import org.junit.*;

public class WaterTest {

  @Test
  public void doesAddWater() {
    Water w = new Water();

    Assert.assertEquals(w.addWater(), "Water");
  }
}