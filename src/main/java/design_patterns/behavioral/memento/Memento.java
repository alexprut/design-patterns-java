package design_patterns.behavioral.memento;

class Memento {

  private final String STATE;

  public Memento(String state) {
    STATE = state;
  }

  public String getSavedState() {
    return STATE;
  }
}