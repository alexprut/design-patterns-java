package design_patterns.creational.singleton;

import org.junit.*;

public class SingletonTest {

  @Test
  public void isSameInstance() {
    Singleton s = Singleton.getInstance();

    Assert.assertEquals(s, Singleton.getInstance());
    Assert.assertEquals(s.doSomething(), "I do something");
  }
}