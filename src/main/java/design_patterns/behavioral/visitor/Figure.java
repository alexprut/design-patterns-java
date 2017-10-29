package design_patterns.behavioral.visitor;

abstract class Figure {

  public String name = "Figure";

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}