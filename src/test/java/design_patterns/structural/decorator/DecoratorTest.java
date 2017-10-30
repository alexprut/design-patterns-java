package design_patterns.structural.decorator;

import org.junit.*;

public class DecoratorTest {

  @Test
  public void mainTest() {
    Coffee c = new SimpleCoffee();
    Coffee custom = new Sugar(new Milk(c));

    Assert.assertEquals(custom.getIngredients(), "SimpleCoffee, Milk, Sugar");
    Assert.assertEquals(custom.getCost(), 1.5, 0);
  }
}