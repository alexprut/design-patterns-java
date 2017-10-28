package design_patterns.behavioral.factory_method;

class LimitedCreator extends Creator {
    public Product factoryMethod() {
        return new LimitedProduct();
    }
}
