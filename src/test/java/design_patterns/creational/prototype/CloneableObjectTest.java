package design_patterns.creational.prototype;

import org.junit.*;

public class CloneableObjectTest {

  @Test
  public void isCloneDifferentWithSameData() {
    int id = 1;
    CloneableObject o1 = new CloneableObject(id);
    CloneableObject o2 = (CloneableObject) o1.clone();

    Assert.assertNotSame(o1, o2);
    Assert.assertEquals(id, o2.getId());
    Assert.assertEquals(id, o1.getId());
  }
}