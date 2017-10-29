package design_patterns.behavioral.mediator;

abstract class Partner {

  protected Mediator mediator;

  public Partner(Mediator mediator) {
    this.mediator = mediator;
  }
}