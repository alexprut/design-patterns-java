package design_patterns.behavioral.visitor;

abstract class Figure {

  protected String name = "Figure";

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}