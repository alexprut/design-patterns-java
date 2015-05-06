class MaleAbstractFactory extends AbstractFactory {
    public Product makeGift() {
        return new MaleGiftProduct();
    }

    public Product makePack() {
        return new MalePackProduct();
    }
}
