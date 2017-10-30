package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class Menu {

  private Map<String, CoffeeFlavour> coffeeFlavours = new HashMap<String, CoffeeFlavour>();

  public CoffeeFlavour lookup(String flavorName) {
    if (!coffeeFlavours.containsKey(flavorName)) {
      coffeeFlavours.put(flavorName, new CoffeeFlavour(flavorName));
    }

    return coffeeFlavours.get(flavorName);
  }
}
