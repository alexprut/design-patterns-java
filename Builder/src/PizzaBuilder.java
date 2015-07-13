import java.util.ArrayList;

public class PizzaBuilder {
    protected ArrayList<String> ingredients;
    protected String name;
    protected int price;
    protected Pizza pizza;

    public Pizza getPizza() {
        return new Pizza(this);
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
