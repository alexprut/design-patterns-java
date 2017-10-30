package design_patterns.structural.facade;

import org.junit.*;

public class CaffeineTest {

  @Test
  public void doesAddCaffeine() {
    Caffeine c = new Caffeine();

    Assert.assertEquals(c.addCaffeine(), "Caffeine");
  }
}