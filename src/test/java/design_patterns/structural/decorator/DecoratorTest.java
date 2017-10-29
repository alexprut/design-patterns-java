package design_patterns.structural.decorator;

import org.junit.*;

public class DecoratorTest {

  @Test
  public void mainTest() {
    Coffee c = new SimpleCoffee();
    Coffee custom = new Sugar(new Milk(c));

    System.out.println(custom.getIngredients());
    System.out.println(custom.getCost());
  }
}