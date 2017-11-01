package design_patterns.behavioral.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConcreteIteratorTest {

  private Iterator iterator;

  @Before
  public void init() {
    iterator = new ConcreteIterator("random word");
  }

  @Test
  public void last() {
    Assert.assertEquals(iterator.last(), "d");
  }

  @Test
  public void first() {
    Assert.assertEquals(iterator.first(), "r");
  }

  @Test
  public void hasNext() {
    Assert.assertTrue(iterator.hasNext());
  }

  @Test
  public void current() {
    Assert.assertEquals(iterator.current(), "r");
  }

  @Test
  public void next() {
    Assert.assertEquals(iterator.next(), "a");
  }
}
