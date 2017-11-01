package design_patterns.behavioral.state;

import org.junit.*;

public class StateTest {

  @Test
  public void designPatternTest() {
    Context c = new Context(new OpenState());

    Assert.assertEquals(c.toString(), "Context with: Open State");

    c.request();
    Assert.assertEquals(c.toString(), "Context with: Close State");
  }
}