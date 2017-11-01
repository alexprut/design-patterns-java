package design_patterns.behavioral.observer;

import org.junit.*;

public class ObserverTest {

  @Test
  public void designPatternTest() {
    Subject observed = new ConcreteSubject();
    Observer observer = new ConcreteObserver(observed);

    Assert.assertNull(observed.getState());
    Assert.assertNull(observer.toString());

    observed.setState("something");

    Assert.assertEquals(observed.getState(), "something");
    Assert.assertEquals(observer.toString(), "something");
  }
}