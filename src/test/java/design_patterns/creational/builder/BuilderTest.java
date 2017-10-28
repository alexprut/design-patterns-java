package design_patterns.creational.builder;

import org.junit.*;

public class BuilderTest {
    @Test
    public void mainTest() {
        PizzaMargheritaBuilder pizzaBuilder = new PizzaMargheritaBuilder();
        pizzaBuilder.setPrice(3);
        Pizza pizza = pizzaBuilder.getPizza();

        System.out.print(pizza.toString());
    }
}
