package design_patterns.creational.builder;

import org.junit.*;

public class PizzaMargheritaBuilderTest {

  @Test
  public void properSerialization() {
    PizzaMargheritaBuilder pizzaBuilder = new PizzaMargheritaBuilder();
    pizzaBuilder.setPrice(3);
    Pizza p1 = pizzaBuilder.getPizza();
    Pizza p2 = new Pizza(pizzaBuilder);

    Assert.assertEquals(p1.toString(), p2.toString());
    Assert.assertEquals(p1.toString(), "Ingredients pomodoro mozzarella; Price: 3; Name: margherita");
  }
}