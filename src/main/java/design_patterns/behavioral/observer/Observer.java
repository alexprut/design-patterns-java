package design_patterns.behavioral.observer;

abstract class Observer {

  String observedState;
  Subject observed;

  public Observer(Subject observed) {
    this.observed = observed;
    this.observed.registerObserver(this);
  }

  public abstract void update();
}