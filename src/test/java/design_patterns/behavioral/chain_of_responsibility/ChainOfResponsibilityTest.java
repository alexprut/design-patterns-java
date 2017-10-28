package design_patterns.behavioral.chain_of_responsibility;

import org.junit.*;

public class ChainOfResponsibilityTest {
    @Test
    public void mainTest() {
        // Create chain
        Chain chain = new NetworkLog();
        Chain second = new SystemLog();
        Chain third = new ApplicationLog();

        chain.setNext(second);
        second.setNext(third);

        chain.handleRequest(Chain.ERR_APPLICATION);
        chain.handleRequest(Chain.ERR_SYSTEM);
        chain.handleRequest(Chain.ERR_APPLICATION);
        chain.handleRequest(Chain.ERR_NETWORK);
    }
}