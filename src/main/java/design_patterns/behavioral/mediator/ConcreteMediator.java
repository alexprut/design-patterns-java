package design_patterns.behavioral.mediator;

class ConcreteMediator implements Mediator {
    FirstPartner first;
    SecondPartner second;

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
}
