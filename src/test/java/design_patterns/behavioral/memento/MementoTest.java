package design_patterns.behavioral.memento;

import java.util.ArrayList;
import org.junit.*;

public class MementoTest {

  @Test
  public void designPatternTest() {
    ArrayList<Memento> savedStates = new ArrayList<Memento>();
    Originator origin = new Originator();

    origin.setState("first");
    Assert.assertEquals(origin.toString(), "first");

    savedStates.add(origin.saveToMemento());
    origin.setState("second");
    Assert.assertEquals(origin.toString(), "second");

    origin.restoreFromMemento(savedStates.get(0));
    Assert.assertEquals(origin.toString(), "first");
  }
}