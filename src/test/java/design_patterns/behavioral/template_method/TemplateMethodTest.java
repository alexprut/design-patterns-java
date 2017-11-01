package design_patterns.behavioral.template_method;

import org.junit.*;

public class TemplateMethodTest {

  @Test
  public void designPatternTest() {
    AbstractClass c = new ConcreteClass();

    Assert.assertEquals(c.templateMethod(), "I do something then I do something else");
  }
}