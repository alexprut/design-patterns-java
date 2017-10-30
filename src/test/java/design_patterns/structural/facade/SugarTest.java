package design_patterns.structural.facade;

import org.junit.*;

public class SugarTest {

  @Test
  public void doesAddSugar() {
    Sugar s = new Sugar();

    Assert.assertEquals(s.addSugar(), "Sugar");
  }
}