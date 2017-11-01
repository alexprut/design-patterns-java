package design_patterns.behavioral.iterator;

import org.junit.Assert;
import org.junit.Test;

public class ConcreteCompoundTest {

  @Test
  public void designPatternTest() {
    Compound c = new ConcreteCompound("random word");
    Iterator it = c.getIterator();

    String output = it.current();
    while (it.hasNext()) {
      output += it.next();
    }

    Assert.assertEquals(output, "random word");
  }
}
