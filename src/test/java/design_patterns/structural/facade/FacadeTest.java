package design_patterns.structural.facade;

import org.junit.*;
import java.lang.System;

public class FacadeTest {

  @Test
  public void mainTest() {
    Facade f = new Facade();

    System.out.println(f.makeCoffee());
  }
}