package design_patterns.behavioral.visitor;

abstract class Visitor {

  public String visit(Figure figure) {
    return figure.name;
  }

  abstract String visit(Square figure);

  abstract String visit(Circle figure);
}