package design_patterns.behavioral.abstract_factory;

class FemaleAbstractFactory extends AbstractFactory {
    public Product makeGift() {
        return new FemaleGiftProduct();
    }

    public Product makePack() {
        return new FemalePackProduct();
    }
}
