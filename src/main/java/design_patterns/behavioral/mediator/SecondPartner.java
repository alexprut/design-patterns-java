package design_patterns.behavioral.mediator;

class SecondPartner extends Partner {

  public SecondPartner(Mediator mediator) {
    super(mediator);
    mediator.registerSecondPartner(this);
  }

  public String execute() {
    return "Second Partner";
  }

  public String executePartner() {
    return mediator.executeFirstPartner();
  }
}