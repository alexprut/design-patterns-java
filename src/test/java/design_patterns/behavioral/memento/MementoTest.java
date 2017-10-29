package design_patterns.behavioral.memento;

import java.util.ArrayList;
import org.junit.*;

public class MementoTest {

  @Test
  public void mainTest() {
    ArrayList<Memento> savedStates = new ArrayList<Memento>();
    Originator origin = new Originator();

    origin.setState("First");
    System.out.println(origin.toString());
    origin.setState("Second");
    System.out.println(origin.toString());
    savedStates.add(origin.saveToMemento());
    origin.setState("First");
    System.out.println(origin.toString());
    origin.restoreFromMemento(savedStates.get(0));
    System.out.println(origin.toString());
  }
}