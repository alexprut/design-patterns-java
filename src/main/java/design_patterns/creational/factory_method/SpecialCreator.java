package design_patterns.behavioral.factory_method;

class SpecialCreator extends Creator {
    public Product factoryMethod() {
        return new SpecialProduct();
    }
}
