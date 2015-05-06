class FemaleAbstractFactory extends AbstractFactory {
    public Product makeGift() {
        return new FemaleGiftProduct();
    }

    public Product makePack() {
        return new FemalePackProduct();
    }
}
