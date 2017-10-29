package design_patterns.creational.abstract_factory;

class MaleAbstractFactory extends AbstractFactory {

  public Product makeGift() {
    return new MaleGiftProduct();
  }

  public Product makePack() {
    return new MalePackProduct();
  }
}