package design_patterns.creational.abstract_factory;

import org.junit.Assert;
import org.junit.Test;

public class MaleAbstractFactoryTest {

  @Test
  public void designPatternTest() {
    AbstractFactory factory = new MaleAbstractFactory();
    Product gift = factory.makeGift();
    Product pack = factory.makePack();

    Assert.assertTrue(gift instanceof MaleGiftProduct);
    Assert.assertTrue(pack instanceof MalePackProduct);
    Assert.assertEquals(gift.getType(), "MaleGiftProduct");
    Assert.assertEquals(pack.getType(), "MalePackProduct");
  }

}
