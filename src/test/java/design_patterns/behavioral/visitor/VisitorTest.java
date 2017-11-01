package design_patterns.behavioral.visitor;

import org.junit.*;

public class VisitorTest {

  @Test
  public void designPatternTest() {
    Visitor visitor = new PrintNameVisitor();
    Circle circle = new Circle();
    Square square = new Square();

    Assert.assertEquals(visitor.visit(circle), "Circle");
    Assert.assertEquals(visitor.visit(square), "Square");
  }
}