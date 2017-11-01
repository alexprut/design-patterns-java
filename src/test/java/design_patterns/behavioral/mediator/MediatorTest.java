package design_patterns.behavioral.mediator;

import org.junit.*;

public class MediatorTest {

  @Test
  public void designPatternTest() {
    Mediator mediator = new ConcreteMediator();
    FirstPartner firstPartner = new FirstPartner(mediator);
    SecondPartner secondPartner = new SecondPartner(mediator);

    Assert.assertEquals(firstPartner.execute(), "First Partner");
    Assert.assertEquals(secondPartner.execute(), "Second Partner");
    Assert.assertEquals(firstPartner.executePartner(), "Second Partner");
    Assert.assertEquals(secondPartner.executePartner(), "First Partner");
  }
}