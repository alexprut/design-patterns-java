package design_patterns.behavioral.abstract_factory;

class MaleAbstractFactory extends AbstractFactory {
    public Product makeGift() {
        return new MaleGiftProduct();
    }

    public Product makePack() {
        return new MalePackProduct();
    }
}
