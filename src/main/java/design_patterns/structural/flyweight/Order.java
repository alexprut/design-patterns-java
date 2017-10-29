package design_patterns.structural.flyweight;

class Order {

  public final int tableNumber;
  public final CoffeeFlavour coffeeFlavour;

  public Order(int tableNumber, CoffeeFlavour coffeeFlavour) {
    this.tableNumber = tableNumber;
    this.coffeeFlavour = coffeeFlavour;
  }

  public String toString() {
    return "Order at table: " + tableNumber + ", coffee flavour: " + coffeeFlavour.getFlavourName();
  }
}