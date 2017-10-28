package design_patterns.creational.factory_method;

class SpecialCreator extends Creator {
    public Product factoryMethod() {
        return new SpecialProduct();
    }
}
