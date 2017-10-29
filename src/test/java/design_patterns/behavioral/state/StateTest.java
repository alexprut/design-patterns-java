package design_patterns.behavioral.state;

import org.junit.*;

public class StateTest {

  @Test
  public void mainTest() {
    Context c = new Context(new OpenState());

    c.request();
    System.out.println(c.toString());

    c.request();
    System.out.println(c.toString());
  }
}