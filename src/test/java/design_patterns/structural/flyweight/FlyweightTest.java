package design_patterns.structural.flyweight;

import org.junit.*;

public class FlyweightTest {
    @Test
    public void mainTest() {
        CoffeeShop shop = new CoffeeShop();
        shop.getOrder(1, "espresso");
        shop.getOrder(7, "macchiato");

        System.out.println(shop.toString());
    }
}
