package design_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.ListIterator;

class CoffeeShop {

  public Menu menu = new Menu();
  public ArrayList<Order> orders = new ArrayList<Order>();

  public void getOrder(int tableNumber, String coffeeFlavour) {
    orders.add(new Order(tableNumber, menu.lookup(coffeeFlavour)));
  }

  public String toString() {
    String report = "";
    ListIterator<Order> orderIterator = orders.listIterator();

    while (orderIterator.hasNext()) {
      report += orderIterator.next().toString() + "\n";
    }

    return report;
  }
}