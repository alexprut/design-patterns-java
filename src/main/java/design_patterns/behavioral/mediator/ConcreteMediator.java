package design_patterns.behavioral.mediator;

class ConcreteMediator implements Mediator {

  private FirstPartner first;
  private SecondPartner second;

  public void registerFirstPartner(FirstPartner partner) {
    first = partner;
  }

  public void registerSecondPartner(SecondPartner partner) {
    second = partner;
  }

  public String executeFirstPartner() {
    return first.execute();
  }

  public String executeSecondPartner() {
    return second.execute();
  }

  public FirstPartner getFirstPartner() {
    return first;
  }

  public SecondPartner getSecondPartner() {
    return second;
  }
}