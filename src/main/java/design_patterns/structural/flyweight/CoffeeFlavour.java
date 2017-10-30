package design_patterns.structural.flyweight;

class CoffeeFlavour {

  private final String FLAVOUR;

  public CoffeeFlavour(String flavourName) {
    FLAVOUR = flavourName;
  }

  public String getFlavourName() {
    return FLAVOUR;
  }
}