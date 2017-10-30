package design_patterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

  @Test
  public void getOrder() {
    Order order = new Order(1, new CoffeeFlavour("exotic"));

    Assert.assertEquals(order.toString(), "Order at table: 1, coffee flavour: exotic");
  }
}
