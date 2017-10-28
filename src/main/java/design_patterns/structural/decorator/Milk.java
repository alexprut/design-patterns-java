package design_patterns.structural.decorator;

class Milk extends CoffeeDecorator {
    public Milk(Coffee decorator) {
        super(decorator);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getIngredients() {
        return super.getIngredients() + ", " + "Milk";
    }
}
