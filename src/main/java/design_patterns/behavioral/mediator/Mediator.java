package design_patterns.behavioral.mediator;

interface Mediator {
    void registerFirstPartner(FirstPartner partner);
    void registerSecondPartner(SecondPartner partner);
    String executeFirstPartner();
    String executeSecondPartner();
}
