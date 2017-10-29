package design_patterns.creational.abstract_factory;

class FemaleAbstractFactory extends AbstractFactory {

  public Product makeGift() {
    return new FemaleGiftProduct();
  }

  public Product makePack() {
    return new FemalePackProduct();
  }
}