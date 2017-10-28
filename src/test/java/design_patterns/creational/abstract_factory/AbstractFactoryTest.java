package design_patterns.creational.abstract_factory;

import org.junit.*;

public class AbstractFactoryTest {
    @Test
    public void mainTest() {
        AbstractFactory factory = new MaleAbstractFactory();
        Product gift = factory.makeGift();
        Product pack = factory.makePack();

        System.out.println(gift.toString() + " " + pack.toString());
    }
}
