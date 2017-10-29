package design_patterns.behavioral.observer;

import org.junit.*;

public class ObserverTest {

  @Test
  public void mainTest() {
    Subject observed = new ConcreteSubject();
    Observer observer = new ConcreteObserver(observed);

    System.out.println(observed.getState());
    System.out.println(observer.toString());

    System.out.println("Update subject state:");
    observed.setState("itIsANewState");

    System.out.println(observed.getState());
    System.out.println(observer.toString());
  }
}