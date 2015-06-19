public class NetworkLog extends Chain {
    public NetworkLog() {
        super.priority = Chain.ERR_NETWORK;
    }

    public void writeMessage() {
        System.out.println("Network error logged");
    }
}
