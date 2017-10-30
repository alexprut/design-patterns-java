package design_patterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class MenuTest {

  @Test
  public void lookupCreationSingleFlavour() {
    Menu m = new Menu();
    CoffeeFlavour cf = m.lookup("exotic");

    Assert.assertEquals(m.lookup("exotic"), cf);
  }
}
