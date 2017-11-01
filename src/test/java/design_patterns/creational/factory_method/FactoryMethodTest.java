package design_patterns.creational.factory_method;

import org.junit.*;

public class FactoryMethodTest {

  @Test
  public void designPatterTest() {
    Creator specialCreator = new SpecialCreator();
    Creator limitedCreator = new LimitedCreator();
    Product specialProduct = specialCreator.factoryMethod();
    Product limitedProduct = limitedCreator.factoryMethod();

    Assert.assertEquals(specialProduct.getType(), "SpecialProduct");
    Assert.assertEquals(limitedProduct.getType(), "LimitedProduct");
  }
}