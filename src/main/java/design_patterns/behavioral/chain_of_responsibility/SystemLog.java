package design_patterns.behavioral.chain_of_responsibility;

public class SystemLog extends Chain {

  public SystemLog() {
    super.priority = Chain.ERR_SYSTEM;
  }

  public void writeMessage() {
    System.out.println("System error logged");
  }
}
