package design_patterns.structural.composite;

import java.util.ArrayList;

class Composite extends Figure {

  private ArrayList<Figure> figures = new ArrayList<Figure>();

  public String draw() {
    String s = "";

    for (Figure f : figures) {
      s += f.draw() + " ";
    }

    return s;
  }

  public void remove(Figure figure) {
    figures.remove(figure);
  }

  public void add(Figure figure) {
    figures.add(figure);
  }
}