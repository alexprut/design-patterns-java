package design_patterns.structural.composite;

abstract class Figure {

  public abstract String draw();

  public void add(Figure figure) {
  }

  public void remove(Figure figure) {
  }
}