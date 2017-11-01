package design_patterns.behavioral.mediator;

class FirstPartner extends Partner {

  public FirstPartner(Mediator mediator) {
    super(mediator);
    mediator.registerFirstPartner(this);
  }

  public String execute() {
    return "First Partner";
  }

  public String executePartner() {
    return mediator.executeSecondPartner();
  }
}