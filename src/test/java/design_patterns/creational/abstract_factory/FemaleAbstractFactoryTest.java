package design_patterns.creational.abstract_factory;

import org.junit.Assert;
import org.junit.Test;

public class FemaleAbstractFactoryTest {

  @Test
  public void designPatternTest() {
    AbstractFactory factory = new FemaleAbstractFactory();
    Product gift = factory.makeGift();
    Product pack = factory.makePack();

    Assert.assertTrue(gift instanceof FemaleGiftProduct);
    Assert.assertTrue(pack instanceof FemalePackProduct);
    Assert.assertEquals(gift.getType(), "FemaleGiftProduct");
    Assert.assertEquals(pack.getType(), "FemalePackProduct");
  }

}
