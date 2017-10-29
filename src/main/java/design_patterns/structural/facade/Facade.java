package design_patterns.structural.facade;

class Facade {

  protected String makeCoffee() {
    Sugar s = new Sugar();
    Caffeine c = new Caffeine();
    Water w = new Water();

    return "Coffee = " + w.addWater() + " + " + c.addCaffeine() + " + " + s.addSugar();
  }
}