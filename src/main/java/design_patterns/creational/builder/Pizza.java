package design_patterns.behavioral.builder;

import java.util.ArrayList;
import java.util.ListIterator;

public class Pizza {
    private ArrayList<String> ingredients;
    private String name;
    private int price;

    public Pizza(String name) {
        this.name = name;
    }

    public Pizza(PizzaBuilder builder) {
        this.ingredients = builder.getIngredients();
        this.name = builder.getName();
        this.price = builder.getPrice();
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

    public String toString() {
        String string = "Ingredients";

        ListIterator<String> iterator = this.ingredients.listIterator();

        while (iterator.hasNext()) {
            string += " " + iterator.next();
        }

        return string + "; Price: " + this.price + "; Name: " + this.name;
    }
}
