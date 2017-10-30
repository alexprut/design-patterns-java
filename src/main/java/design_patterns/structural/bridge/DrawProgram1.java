package design_patterns.structural.bridge;

class DrawProgram1 extends DrawProgram {

  public String drawCircle() {
    return "DrawProgram1: Circle";
  }

  public String drawLine() {
    return "DrawProgram1: Line";
  }
}