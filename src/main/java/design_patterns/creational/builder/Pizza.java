package design_patterns.creational.builder;

import java.util.ArrayList;
import java.util.ListIterator;

public class Pizza {

  private ArrayList<String> ingredients;
  private String name;
  private int price;

  public Pizza() {
  }

  public Pizza(String name) {
    setName(name);
  }

  public Pizza(PizzaBuilder builder) {
    setIngredients(builder.getIngredients());
    setName(builder.getName());
    setPrice(builder.getPrice());
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

    for (String ingredient : ingredients) {
      string += " " + ingredient;
    }

    return string + "; Price: " + this.price + "; Name: " + this.name;
  }
}