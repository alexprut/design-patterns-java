package design_patterns.structural.flyweight;

import org.junit.*;

public class CoffeeShopTest {

  @Test
  public void mainTest() {
    CoffeeShop shop = new CoffeeShop();
    shop.getOrder(1, "espresso");
    shop.getOrder(7, "macchiato");

    Assert.assertEquals(
        shop.toString(),
        "Order at table: 1, coffee flavour: espresso\nOrder at table: 7, coffee flavour: macchiato\n"
    );
  }
}