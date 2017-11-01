package design_patterns.behavioral.strategy;

class Concrete {

  protected Strategy strategy;

  public Concrete(Strategy strategy) {
    setStrategy(strategy);
  }

  public String algorithm() {
    return strategy.algorithm();
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}