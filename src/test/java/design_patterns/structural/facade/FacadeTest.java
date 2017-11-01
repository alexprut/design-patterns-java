package design_patterns.structural.facade;

import org.junit.*;

public class FacadeTest {

  @Test
  public void designPatternTest() {
    Facade f = new Facade();

    Assert.assertEquals(f.makeCoffee(), "Coffee = Water + Caffeine + Sugar");
  }
}