package design_patterns.behavioral.visitor;

import org.junit.*;

public class VisitorTest {

  public void mainTest() {
    Visitor visitor = new PrintNameVisitor();
    Circle circle = new Circle();
    Square square = new Square();

    System.out.println(visitor.visit(circle));
    System.out.println(visitor.visit(square));
  }
}