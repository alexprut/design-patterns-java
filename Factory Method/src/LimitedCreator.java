class LimitedCreator extends Creator {
    public Product factoryMethod() {
        return new LimitedProduct();
    }
}
