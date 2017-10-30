package design_patterns.structural.flyweight;

import java.util.ArrayList;

class CoffeeShop {

  private Menu menu = new Menu();
  private ArrayList<Order> orders = new ArrayList<Order>();

  public void getOrder(int tableNumber, String coffeeFlavour) {
    orders.add(new Order(tableNumber, menu.lookup(coffeeFlavour)));
  }

  public String toString() {
    String report = "";

    for (Order order : orders) {
      report += order.toString() + "\n";
    }

    return report;
  }
}