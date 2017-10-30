package design_patterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class CoffeeFlavourTest {

  @Test
  public void isFlavorSet() {
    CoffeeFlavour cf = new CoffeeFlavour("exotic");

    Assert.assertEquals(cf.getFlavourName(), "exotic");
  }
}
