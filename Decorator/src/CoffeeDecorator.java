abstract class CoffeeDecorator extends Coffee {
    private final Coffee decorator;

    public CoffeeDecorator(Coffee decorator) {
        this.decorator = decorator;
    }

    public double getCost() {
        return decorator.getCost();
    }

    public String getIngredients() {
        return decorator.getIngredients();
    }
}
