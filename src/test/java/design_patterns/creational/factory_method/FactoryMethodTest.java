package design_patterns.creational.factory_method;

import org.junit.*;

public class FactoryMethodTest {
    @Test
    public void mainTest() {
        FactoryMethodTest.display(new SpecialCreator());
    }

    public static void display(Creator c) {
        Product p = c.factoryMethod();

        System.out.println(p.getType());
    }
}
