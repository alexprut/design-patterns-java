package design_patterns.behavioral.strategy;

import org.junit.*;

public class StrategyTest {

  @Test
  public void mainTest() {
    Concrete firstAlg = new Concrete(new FirstStrategy());
    Concrete secondAlg = new Concrete(new SecondStrategy());

    System.out.println(firstAlg.algorithm());
    System.out.println(secondAlg.algorithm());
  }
}