package design_patterns.structural.flyweight;

class CoffeeFlavour {
    private final String flavourName;

    public CoffeeFlavour(String flavourName) {
        this.flavourName = flavourName;
    }

    public String getFlavourName() {
        return this.flavourName;
    }
}
