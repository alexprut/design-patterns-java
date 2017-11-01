package design_patterns.creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTest {

  @Test
  public void properSerialization() {
    Pizza p = new Pizza();
    p.setPrice(1);
    p.setName("marinara");
    p.setIngredients(new ArrayList<String>(Arrays.asList("mozzarella", "pomodoro")));

    Assert.assertEquals(p.toString(), "Ingredients mozzarella pomodoro; Price: 1; Name: marinara");
  }
}
