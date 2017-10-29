package design_patterns.behavioral.state;

class Context {

  private State state;

  public Context(State state) {
    this.state = state;
  }

  public void request() {
    state.request(this);
  }

  public void setState(State state) {
    this.state = state;
  }

  public String toString() {
    return "Context with: " + state.toString();
  }
}