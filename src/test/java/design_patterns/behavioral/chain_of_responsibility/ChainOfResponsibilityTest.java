package design_patterns.behavioral.chain_of_responsibility;

import org.junit.*;

public class ChainOfResponsibilityTest {

  @Test
  public void designPatternTest() {
    Chain chain = new NetworkLog();
    Chain second = new SystemLog();
    Chain third = new ApplicationLog();

    chain.setNext(second);
    second.setNext(third);

    Assert.assertEquals(chain.handleRequest(Chain.ERR_APPLICATION), "Application error logged");
    Assert.assertEquals(chain.handleRequest(Chain.ERR_SYSTEM), "System error logged");
    Assert.assertEquals(chain.handleRequest(Chain.ERR_NETWORK), "Network error logged");
    Assert.assertEquals(chain.handleRequest(100), "Request Not Handled");
  }
}