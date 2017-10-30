package design_patterns.structural.flyweight;

class Order {

  private final int TABLE_NUMBER;
  private final CoffeeFlavour COFFEE_FLAVOUR;

  public Order(int tableNumber, CoffeeFlavour coffeeFlavour) {
    TABLE_NUMBER = tableNumber;
    COFFEE_FLAVOUR = coffeeFlavour;
  }

  public String toString() {
    return "Order at table: " + TABLE_NUMBER + ", coffee flavour: " + COFFEE_FLAVOUR
        .getFlavourName();
  }
}