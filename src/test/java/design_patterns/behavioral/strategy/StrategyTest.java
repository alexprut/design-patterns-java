package design_patterns.behavioral.strategy;

import org.junit.*;

public class StrategyTest {

  @Test
  public void designPatternTest() {
    Strategy s1 = new FirstStrategy();
    Strategy s2 = new SecondStrategy();
    Concrete concrete = new Concrete(s1);

    Assert.assertEquals(concrete.algorithm(), "Do something then Do something else");

    concrete.setStrategy(s2);
    Assert.assertEquals(
        concrete.algorithm(),
        "Do something then Do something else and Do something different"
    );
  }
}