package design_patterns.behavioral.mediator;

import org.junit.*;

public class MediatorTest {
    @Test
    public void mainTest() {
        Mediator mediator = new ConcreteMediator();
        FirstPartner firstPartner = new FirstPartner(mediator);
        SecondPartner secondPartner = new SecondPartner(mediator);

        System.out.println(firstPartner.execute());
        System.out.println(secondPartner.execute());
    }
}
