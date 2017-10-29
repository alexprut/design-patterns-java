package design_patterns.behavioral.memento;

class Memento {

  public final String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getSavedState() {
    return this.state;
  }
}