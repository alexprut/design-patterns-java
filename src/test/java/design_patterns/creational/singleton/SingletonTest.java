package design_patterns.creational.singleton;

import org.junit.*;

public class SingletonTest {

  @Test
  public void mainTest() {
    Singleton s = Singleton.getInstance();

    System.out.println(s.doSomething());
  }
}