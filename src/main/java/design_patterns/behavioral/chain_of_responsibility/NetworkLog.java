package design_patterns.behavioral.chain_of_responsibility;

public class NetworkLog extends Chain {

  public NetworkLog() {
    super.priority = Chain.ERR_NETWORK;
  }

  public String writeMessage() {
    return "Network error logged";
  }
}
