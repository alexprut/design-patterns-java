abstract class Chain {
    public static final int ERR_SYSTEM = 1;
    public static final int ERR_APPLICATION = 2;
    public static final int ERR_NETWORK = 3;
    protected int priority;
    private Chain next = null;

    public void handleRequest(int priority) {
        if (this.priority == priority) {
            this.writeMessage();
        } else if (next != null) {
            this.next.handleRequest(priority);
        }
    }

    public void setNext(Chain nextChain) {
        this.next = nextChain;
    }

    public abstract void writeMessage();
}
