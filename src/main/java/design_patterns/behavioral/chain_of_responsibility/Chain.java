package design_patterns.behavioral.chain_of_responsibility;

abstract class Chain {

  protected static final int ERR_SYSTEM = 1;
  protected static final int ERR_APPLICATION = 2;
  protected static final int ERR_NETWORK = 3;
  protected int priority;
  private Chain next = null;

  public String handleRequest(int priority) {
    if (this.priority == priority) {
      return this.writeMessage();
    } else if (next != null) {
      return this.next.handleRequest(priority);
    }

    return "Request Not Handled";
  }

  public void setNext(Chain nextChain) {
    this.next = nextChain;
  }

  public abstract String writeMessage();
}
